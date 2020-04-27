package com.geekbrains.patternsample.model.uml;

public class User {
    private Purchase purchase;

    public void createPurchase(){
        purchase = new Purchase();
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public Purchase loadPurchase(){
        return new Purchase();
    }
    public void savePurchase(){

    }

    public Purchase clonePurchase(Purchase oldPurchase){
        //TODO реализовать патерн Прототип
        return oldPurchase;
    }
}
