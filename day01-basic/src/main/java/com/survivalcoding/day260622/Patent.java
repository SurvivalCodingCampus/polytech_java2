package com.survivalcoding.day260622;

public class Patent extends IntangibleAsset{
    String intangibleName;


    public Patent(String name, int price, String type, String intangibleName) {
        super(name, price, type);
        this.intangibleName = intangibleName;
    }
}
