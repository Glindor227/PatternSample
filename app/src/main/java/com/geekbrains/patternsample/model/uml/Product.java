package com.geekbrains.patternsample.model.uml;

import java.io.Serializable;

public class Product implements Serializable {
    private String id = generateId();;
    private String name = "";
    private String title = "";
    private MoneyBlock price ;
    private Type type;
    private Integer count;
    private Boolean complete = false;


    // Продукт с минимальным описанием
    public Product(Type type, Integer count) {
        this.type = type; // йогурт (в Молочке)
//        this.name = "";
//        this.title = "";
//        this.price = null;
        this.count = count; // 2 штуки
    }





    private String generateId() {
        return "id";
    }

    public String getName() {
        return name;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public MoneyBlock getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public Integer getCount() {
        return count;
    }

    public Boolean getComplete() {
        return complete;
    }

    //реализация патерна Builder
    public static Builder newBuilder(Type type, Integer count){
        return new Product(type, count).new Builder();
    }
    public class Builder{
        private Builder() {
        }
        public Builder setName(String name){
            Product.this.name = name;
            return this;
        }
        public Builder setStrong(String title, MoneyBlock price){
            Product.this.title = title;
            Product.this.price = price;
            return this;
        }
        public Product build(){
            return Product.this;
        }
    }
}
