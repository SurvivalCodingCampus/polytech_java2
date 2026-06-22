package com.survivalcoding;

public class IntangibleAsset extends Asset {
    String licenseNumber;

    public IntangibleAsset(String name, String licenseNumber) {
        super(name);
        this.licenseNumber = licenseNumber;
    }
}
