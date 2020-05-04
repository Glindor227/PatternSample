package com.geekbrains.patternsample.model.uml.tools;

import com.geekbrains.patternsample.model.uml.Product;

// Это патерн "Посредик". Он сравнивает два Product не обременяя этим сраниванием сами Product
public class ProductMinPriority implements ProductComparator {
 @Override
 public int compare(Product p1, Product p2) {
   return p1.getType().getLocation().getPriority()-p2.getType().getLocation().getPriority();
 }
}
