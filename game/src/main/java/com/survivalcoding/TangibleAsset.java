package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    private double weight;
    private String color;
    private int price;

    public TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //public double getWeight() {
    @Override
    public double weight() {
        return weight;
        //return this.weight;
    }

    //public void setWeight(double weight) {
    @Override
    public void setweight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight();
    }

    public void setWeight(double weight) {
        setweight(weight);
    }
}
