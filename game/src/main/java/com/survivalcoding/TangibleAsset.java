package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    private int price;
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
