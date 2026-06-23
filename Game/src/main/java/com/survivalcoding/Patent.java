package com.survivalcoding;

public class Patent extends IntangibleAsset {
    private String patentNumber;

    public Patent(String name, int price, String patentNumber) {
        super(name, price);
        this.patentNumber = patentNumber;
    }

    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber;
    }
}
