package com.survivalcoding;

public abstract class Asset {

    String name;
    int price;

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
