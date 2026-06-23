package com.survivalcoding.day260622;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color, double weight) {
        super(name, price);
        this.color = color;
        setWeight(weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {

        if (weight < 0) {
              throw new IllegalArgumentException("weight는 0 이상이어야 합니다.");
         }
        this.weight = weight;
    }
}
