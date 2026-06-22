package com.survivalcoding;

public abstract class TangibleAsset {
    String name;
    int price;
    String color;

    TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }
}
