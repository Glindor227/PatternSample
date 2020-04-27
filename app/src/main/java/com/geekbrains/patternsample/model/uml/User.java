package com.geekbrains.patternsample.model.uml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

    public static Purchase clonePurchase(Purchase oldPurchase) throws IOException, ClassNotFoundException {
        //TODO реализовать патерн Прототип
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(oldPurchase);

        ByteArrayInputStream bis = new   ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        Purchase copied = (Purchase) in.readObject();
        return copied;
    }
}
