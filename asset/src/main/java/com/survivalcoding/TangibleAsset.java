package com.survivalcoding;

public abstract class TangibleAsset extends Asset {
    private String color;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
