package com.yuridev.calculadoramateriais.model;

import java.util.ArrayList;
import java.util.List;

public class PlantaBaixa {
    private List<Pilar> pilares = new ArrayList<>();
    private List<Parede> paredes = new ArrayList<>();

    public List<Pilar> getPilares() { return pilares; }
    public void setPilares(List<Pilar> pilares) { this.pilares = pilares; }
    public List<Parede> getParedes() { return paredes; }
    public void setParedes(List<Parede> paredes) { this.paredes = paredes; }
}
