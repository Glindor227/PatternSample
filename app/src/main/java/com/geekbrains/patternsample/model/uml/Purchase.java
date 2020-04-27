package com.geekbrains.patternsample.model.uml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Purchase implements Serializable {
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
    //забыли реализовать в init commit
    public String print(){
        if(products==null || products.size()==0)
            return "Список продуктов пуст";
        StringBuilder strP = new StringBuilder();
        for (Product p:products) {
            strP.append(p.getType().getName()).append(" - ");
            strP.append(p.getName()).append(" - ");
            strP.append(p.getTitle()).append(" - ");
            if (p.getPrice()!=null)
                strP.append(p.getPrice().getCost()).append(" - ");
            strP.append(p.getCount()).append("\n\n");
        }
        return strP.toString();
    }
}
