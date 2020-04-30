package com.geekbrains.patternsample.model.uml;

import com.geekbrains.patternsample.model.base.StringView;

import java.io.Serializable;

//Покупка  по количеству в штуках(Купить 2 пачки сосисок)
public class CountItem implements Serializable,Count<Integer>, StringView {
    private Integer count;

    public CountItem(Integer count) {
        this.count = count;
    }
    @Override
    public Integer getCount() {
        return count;
    }

    @Override
    public StringBuilder print(StringBuilder input) {
        input.append("Количество: ").append(count).append(" шт.").append("\n");
        return input;
    }
}
