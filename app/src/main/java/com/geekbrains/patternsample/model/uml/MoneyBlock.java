package com.geekbrains.patternsample.model.uml;

import com.geekbrains.patternsample.model.base.StringView;

import java.io.Serializable;

public class MoneyBlock implements Serializable, StringView {
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

    @Override
    public StringBuilder print(StringBuilder input) {
        input.append("Цена товара: ").append(cost).append("\n");
        return input;
    }
}
