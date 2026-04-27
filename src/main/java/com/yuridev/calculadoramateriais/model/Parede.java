package com.yuridev.calculadoramateriais.model;

import java.util.ArrayList;
import java.util.List;

public class Parede {
    private String id;
    private Pilar origem;
    private Pilar destino;
    private double espessura;
    private double altura;
    private double comprimento;
    private List<Abertura> aberturas = new ArrayList<>();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Pilar getOrigem() { return origem; }
    public void setOrigem(Pilar origem) { this.origem = origem; }
    public Pilar getDestino() { return destino; }
    public void setDestino(Pilar destino) { this.destino = destino; }
    public double getEspessura() { return espessura; }
    public void setEspessura(double espessura) { this.espessura = espessura; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }
    public List<Abertura> getAberturas() { return aberturas; }
    public void setAberturas(List<Abertura> aberturas) { this.aberturas = aberturas; }
}
