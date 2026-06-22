package com.survivalcoding.day260622;

public class Patent extends IntangibleAsset {
    private String intangibleName;


    public Patent(String name, int price, String type, String intangibleName) {
        super(name, price, type);
        this.intangibleName = intangibleName;
    }

    public String getIntangibleName() {
        return intangibleName;
    }

    public void setIntangibleName(String intangibleName) {
        this.intangibleName = intangibleName;
    }
}
