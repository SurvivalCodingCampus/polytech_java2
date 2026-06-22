package com.survivalcoding;

public abstract class TangibleAsset extends Asset {
    int price;
    String color;

    TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }
}
