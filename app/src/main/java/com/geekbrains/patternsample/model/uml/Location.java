package com.geekbrains.patternsample.model.uml;

public class Location {
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
}
