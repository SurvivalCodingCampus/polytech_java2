package com.survivalcoding.day260622;

public abstract class IntangibleAsset extends Asset {
    private String type;

    public IntangibleAsset(String name, int price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
