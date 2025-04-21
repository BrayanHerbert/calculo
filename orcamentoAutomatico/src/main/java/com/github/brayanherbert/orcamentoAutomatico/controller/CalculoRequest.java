package com.github.brayanherbert.orcamentoAutomatico.controller;

public class CalculoRequest {
    private double seuMetro;
    private double larguraMetro;
    private double comprimentoMetro;

    public CalculoRequest(double seuMetro, double larguraMetro, double comprimentoMetro) {
        this.seuMetro = seuMetro;
        this.larguraMetro = larguraMetro;
        this.comprimentoMetro = comprimentoMetro;
    }

    public double getComprimentoMetro() {
        return comprimentoMetro;
    }

    public void setComprimentoMetro(double comprimentoMetro) {
        this.comprimentoMetro = comprimentoMetro;
    }

    public double getLarguraMetro() {
        return larguraMetro;
    }

    public void setLarguraMetro(double larguraMetro) {
        this.larguraMetro = larguraMetro;
    }

    public double getSeuMetro() {
        return seuMetro;
    }

    public void setSeuMetro(double seuMetro) {
        this.seuMetro = seuMetro;
    }
}
