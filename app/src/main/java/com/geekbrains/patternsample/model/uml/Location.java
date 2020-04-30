package com.geekbrains.patternsample.model.uml;

import com.geekbrains.patternsample.model.base.StringView;

import java.io.Serializable;

public class Location implements Serializable, StringView {
    private String name;
    private Integer priority;

    public Location(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public StringBuilder print(StringBuilder input) {
        input.append("Отдел: ").append(name).append("\n");
        return input;
    }
}
