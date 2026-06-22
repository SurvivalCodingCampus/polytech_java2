package com.survivalcoding.day260622;

public abstract class IntangibleAsset extends Asset{
    String type;

    public IntangibleAsset(String name, int price, String type) {
        super(name, price);
        this.type = type;
    }
}
