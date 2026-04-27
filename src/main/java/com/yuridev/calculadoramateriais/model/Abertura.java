package com.yuridev.calculadoramateriais.model;

public class Abertura {
    private String tipo; // Porta ou Janela
    private double altura;
    private double largura;

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }
    
    public double getArea() {
        return altura * largura;
    }
}
