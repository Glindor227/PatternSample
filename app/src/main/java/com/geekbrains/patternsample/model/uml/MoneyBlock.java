package com.geekbrains.patternsample.model.uml;

import java.io.Serializable;

public class MoneyBlock implements Serializable {
    private float cost;
    private boolean sale;


    public MoneyBlock(float cost, boolean sale) {
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
