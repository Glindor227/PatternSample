package com.geekbrains.patternsample.model;

import com.geekbrains.patternsample.model.uml.Location;
import com.geekbrains.patternsample.model.uml.Type;

import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    private List<Type> types;
    private List<Location> locations;

    public MainRepository() {
        types = new ArrayList<>();
        locations = new ArrayList<>();
    }

    public void addType(Type input){
        types.add(input);
    }
    public void addLocation(Location input){
        locations.add(input);
    }

    public Type getTypesByName(String name) {
        // TODO пока не реализовано
        return types.get(0);
    }

    public List<Location> getLocations() {
        return locations;
    }
}
