package com.geekbrains.patternsample.model;

import com.geekbrains.patternsample.model.uml.Location;
import com.geekbrains.patternsample.model.uml.Type;

import java.util.ArrayList;
import java.util.List;

public class MainRepository {
    private List<Type> types;
    private List<Location> locations;

    private static MainRepository instance;
    public static MainRepository getInstance(){
        if(MainRepository.instance==null){
            synchronized (MainRepository.class){
                if(MainRepository.instance==null){
                    instance = new MainRepository();
                }
            }
        }
        return MainRepository.instance;
    }

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
        // TODO конечно хранить и искать надо не так
        for (Type t:types) {
            if (t.getName().contains(name))
                return t;
        }
        return types.get(0);
    }

    public List<Location> getLocations() {
        return locations;
    }
}
