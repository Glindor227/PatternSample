package com.geekbrains.patternsample.model.uml;

public class Product {
    private String id = generateId();;
    private String name = "";
    private String title = "";
    private Price price ;
    private Type type;
    private Integer count;
    private Boolean complete = false;

    // TODO множественный конструктор - применить патерн Строитель
    //Продукт с точным соответствием
    public Product( String name, String title, Price price, Type type, Integer count) {
        this.type = type; // йогурт (в Молочке)
        this.name = name; // натуральный обезжиренный
        this.title = title;// фабрики Бабаевской
        this.price = price; // 37.50(скидка есть)
        this.count = count; // 2 штуки
    }

    // Продукт с неточным описанием
    public Product( String name, Type type, Integer count) {
        this.type = type; // йогурт (в Молочке)
        this.name = name; // натуральный обезжиренный
//        this.title = "";
//        this.price = null;
        this.count = count; // 2 штуки
    }

    // Продукт с примерным описанием
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

    public Price getPrice() {
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
}
