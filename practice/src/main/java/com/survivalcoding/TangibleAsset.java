package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    int price;
    String color;

    double weight;

    TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
