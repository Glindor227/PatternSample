package com.geekbrains.patternsample.model.uml.tools;

import com.geekbrains.patternsample.model.uml.Product;
import com.geekbrains.patternsample.model.uml.Purchase;

import java.util.ArrayList;
import java.util.List;
/**
 Это патерн "Итератор". Он обходит коллекцию по своему алгоритму(в данном случаии по реализованному в посреднике минимальному приоритету отдела покупки)
*/
public class PurchaseIterator {
    private List<Product> products;
    private ProductComparator comparator;
    private List<String> productsIdMinus = new ArrayList<>();// это массив id продуктов, которые уже выдавались


    public PurchaseIterator(Purchase purchase,ProductComparator comparator) {
        this.products = purchase.getProducts();
        this.comparator = comparator;
    }

    public Product getNext(){
        Product pWork = getAny();
        if(pWork==null)
            return null;
        for (Product p:products) {
            if(productsIdMinus.contains(p.getId()))
                continue;
            if(comparator.compare(p,pWork)<0){
                pWork = p;
            }
        }
        productsIdMinus.add(pWork.getId());
        return pWork;

    }

    private Product getAny() {
        for (Product p : products) {
            if (!productsIdMinus.contains(p.getId()))
                return p;
        }
        return null;
    }
    public boolean hasNest(){
        return productsIdMinus.size() < products.size();

    }
}
