package com.geekbrains.patternsample.model.uml;

import java.io.Serializable;

public class Type implements Serializable {
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
}
