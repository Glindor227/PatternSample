package com.geekbrains.patternsample.model.uml;

import com.geekbrains.patternsample.model.base.StringView;

import java.io.Serializable;

// покупка по сумме(Пупить яблок на 300руб)
public class CountTotalMoney implements Serializable,Count<Float>, StringView {
    private Float count;

    public CountTotalMoney(Float count) {
        this.count = count;
    }

    @Override
    public Float getCount() {
        return count;
    }

    @Override
    public StringBuilder print(StringBuilder input) {
        input.append("На сумму ").append(count).append(" руб.").append("\n");
        return input;
    }
}
