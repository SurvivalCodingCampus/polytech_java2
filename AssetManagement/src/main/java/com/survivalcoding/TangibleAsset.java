package com.survivalcoding;

public abstract class TangibleAsset {
    private final String name;
    private final int price;
    private final String color;

    public TangibleAsset(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getColor(){
        return color;
    }

}
