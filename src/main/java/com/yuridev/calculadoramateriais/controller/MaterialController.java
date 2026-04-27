package com.yuridev.calculadoramateriais.controller;

import com.yuridev.calculadoramateriais.model.Abertura;
import com.yuridev.calculadoramateriais.model.Parede;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MaterialController {

    // Classe simples para receber os dados
    static class DadosFundacao {
        public List<Parede> paredes;
        public double alturaViga;
    }

    @PostMapping("/fundacao")
    public double calcularFundacao(@RequestBody DadosFundacao dados) {
        double totalVolume = 0;
        
        for (Parede p : dados.paredes) {
            double larg = p.getEspessura();
            double comp = p.getComprimento();
            double alt = dados.alturaViga;
            
            totalVolume = totalVolume + (larg * alt * comp);
        }
        
        return totalVolume;
    }

    static class DadosTijolo {
        public List<Parede> paredes;
        public double alturaTijolo;
        public double larguraTijolo;
        public double comprimentoTijolo;
    }

    @PostMapping("/tijolos")
    public int calcularTijolos(@RequestBody DadosTijolo dados) {
        double areaDeUmTijolo = dados.alturaTijolo * dados.comprimentoTijolo;
        double totalTijolos = 0;
        
        for (Parede p : dados.paredes) {
            double areaParede = p.getAltura() * p.getComprimento();
            
            // se tiver porta ou janela, diminui da area
            if (p.getAberturas() != null) {
                for (Abertura ab : p.getAberturas()) {
                    areaParede = areaParede - ab.getArea();
                }
            }
            
            double tijolosNestaParede = areaParede / areaDeUmTijolo;
            totalTijolos = totalTijolos + tijolosNestaParede;
        }
        
        return (int) totalTijolos;
    }
}
