package com.yuridev.calculadoramateriais.model;

public class Esquadria {
    private String categoria; // porta, janela, etc
    private double h; // height
    private double w; // width

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public double getH() { return h; }
    public void setH(double h) { this.h = h; }
    public double getW() { return w; }
    public void setW(double w) { this.w = w; }
    
    public double calcAreaVazada() {
        return h * w;
    }
}
