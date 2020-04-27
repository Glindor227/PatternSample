package com.geekbrains.patternsample.model.uml;

public class Type {
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
