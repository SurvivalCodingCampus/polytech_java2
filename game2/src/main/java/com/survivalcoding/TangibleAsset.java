package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    private double weight;
    private String color;

    public TangibleAsset(String name, int price, double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
