package com.yuridev.calculadoramateriais.controller;

import com.yuridev.calculadoramateriais.model.Esquadria;
import com.yuridev.calculadoramateriais.model.Parede;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/engenharia")
public class ControleObrasController {

    // Struct para a fundacao
    static class ParametrosFundacao {
        public List<Parede> muros;
        public double vigaH; // altura da viga
    }

    @PostMapping("/calc-fundacao")
    public double executaCalculoFundacao(@RequestBody ParametrosFundacao parametros) {
        double accVolume = 0.0;
        
        int i = 0;
        while (i < parametros.muros.size()) {
            Parede atual = parametros.muros.get(i);
            double base = atual.getGrossura();
            double profundidade = atual.getDimensaoComprimento();
            
            accVolume += (base * parametros.vigaH * profundidade);
            i++;
        }
        
        return accVolume;
    }

    // Struct para tijolos
    static class ParametrosTijolos {
        public List<Parede> muros;
        public double tAltura;
        public double tLargura;
        public double tComprimento;
    }

    @PostMapping("/calc-tijolos")
    public int executaCalculoTijolos(@RequestBody ParametrosTijolos input) {
        double faceTijolo = input.tAltura * input.tComprimento;
        double qtdTotal = 0;
        
        for (Parede wall : input.muros) {
            double sqMetros = wall.getPeDireito() * wall.getDimensaoComprimento();
            
            // descontar os buracos
            if (wall.getListaEsquadrias() != null && !wall.getListaEsquadrias().isEmpty()) {
                for (Esquadria buraco : wall.getListaEsquadrias()) {
                    sqMetros = sqMetros - buraco.calcAreaVazada();
                }
            }
            
            qtdTotal += (sqMetros / faceTijolo);
        }
        
        return (int) qtdTotal; // arredondamento padrao pra baixo
    }
}
