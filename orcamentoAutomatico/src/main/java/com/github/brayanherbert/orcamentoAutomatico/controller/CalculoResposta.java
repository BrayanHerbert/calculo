package com.github.brayanherbert.orcamentoAutomatico.controller;

public class CalculoResposta {
    private double totalMetro;
    private double precoTotal;

    public CalculoResposta(double totalMetro, double precoTotal) {
        this.totalMetro = totalMetro;
        this.precoTotal = precoTotal;
    }

    public double getTotalMetro() {
        return totalMetro;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

}
