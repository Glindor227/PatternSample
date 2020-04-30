package com.geekbrains.patternsample.model.uml;

import com.geekbrains.patternsample.model.base.StringView;

import java.io.Serializable;

public class Type implements Serializable, StringView {
    private String name;
    private Location location;

    public Type(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public StringBuilder print(StringBuilder input) {
        input = location.print(input);
        input.append("Товар: ").append(name).append("\n");
        return input;
    }
}
