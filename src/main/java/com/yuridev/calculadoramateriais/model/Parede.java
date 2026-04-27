package com.yuridev.calculadoramateriais.model;

import java.util.ArrayList;
import java.util.List;

public class Parede {
    private String idParede;
    private Pilar verticeInicial;
    private Pilar verticeFinal;
    private double grossura;
    private double peDireito; // altura
    private double dimensaoComprimento;
    private List<Esquadria> listaEsquadrias = new ArrayList<>();

    public String getIdParede() { return idParede; }
    public void setIdParede(String idParede) { this.idParede = idParede; }
    public Pilar getVerticeInicial() { return verticeInicial; }
    public void setVerticeInicial(Pilar verticeInicial) { this.verticeInicial = verticeInicial; }
    public Pilar getVerticeFinal() { return verticeFinal; }
    public void setVerticeFinal(Pilar verticeFinal) { this.verticeFinal = verticeFinal; }
    public double getGrossura() { return grossura; }
    public void setGrossura(double grossura) { this.grossura = grossura; }
    public double getPeDireito() { return peDireito; }
    public void setPeDireito(double peDireito) { this.peDireito = peDireito; }
    public double getDimensaoComprimento() { return dimensaoComprimento; }
    public void setDimensaoComprimento(double dimensaoComprimento) { this.dimensaoComprimento = dimensaoComprimento; }
    public List<Esquadria> getListaEsquadrias() { return listaEsquadrias; }
    public void setListaEsquadrias(List<Esquadria> listaEsquadrias) { this.listaEsquadrias = listaEsquadrias; }
}
