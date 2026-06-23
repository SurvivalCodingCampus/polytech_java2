package com.survivalcoding;

public class Computer extends TangibleAsset{
    private final String makerName;

    public Computer(String name, int price, String color, String makerName){
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName(){
        return makerName;
    }
}
