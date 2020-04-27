package com.geekbrains.patternsample.model.uml;

public class Price {
    private float cost;
    private boolean sale;

    public Price(float cost, boolean sale) {
        this.cost = cost;
        this.sale = sale;
    }

    public float getCost() {
        return cost;
    }

    public boolean isSale() {
        return sale;
    }
}
