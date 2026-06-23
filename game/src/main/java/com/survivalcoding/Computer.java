package com.survivalcoding;

public class Computer extends TangibleAsset {
    int price;
    String name;
    String color;
    String makeName;

    void price() {
        super.setPrice(price);
    }

    void color() {
        super.setColor(color);
    }

    void name() {
        super.setName(name);
    }

    public void makeName(String makeName) {
        this.makeName = makeName;
    }
}
