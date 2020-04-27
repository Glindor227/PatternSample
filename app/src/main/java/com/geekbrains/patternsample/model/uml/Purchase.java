package com.geekbrains.patternsample.model.uml;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private List<Product> products;

    public Purchase() {
        products = new ArrayList<>();
    }
     public void addProduct(Product newP){
         products.add(newP);
     }
     public void clear(){
        products.clear();
     }
     public void sortByLocation(){
        //TODO реализовать сортировку products по локации
     }

    public List<Product> getProducts() {
        return products;
    }
    public String print(){
        return "Список продуктов";
    }
}
