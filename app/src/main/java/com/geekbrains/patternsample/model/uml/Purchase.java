package com.geekbrains.patternsample.model.uml;

import com.geekbrains.patternsample.model.base.StringView;
import com.geekbrains.patternsample.model.uml.tools.ProductMinPriority;
import com.geekbrains.patternsample.model.uml.tools.PurchaseIterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Purchase implements Serializable, StringView {
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
     public float getTotalMoney(){
        float total = 0f;
         for (Product p:products) {
             //Декоратор
             total = total + (new CalculateMoney(p)).getTotal();
         }
         return total;
     }
     public void sortByLocation(){
        //TODO реализовать сортировку products по локации
     }

    public List<Product> getProducts() {
        return products;
    }


    //патерна Компоновщик
    @Override
    public StringBuilder print(StringBuilder input) {
        if(products==null || products.size()==0)
            return input.append("Список продуктов пуст");
        input.append("Покупка:\n\n");

        //Используем итератор и посредник
        PurchaseIterator iterator = new PurchaseIterator(this,new ProductMinPriority());
        while (iterator.hasNest()){
            iterator.getNext().print(input);
            input.append("\n");

        }
/*
        for (Product p:products) {
            p.print(input);
            input.append("\n");
        }
*/
        return input;
    }
}
