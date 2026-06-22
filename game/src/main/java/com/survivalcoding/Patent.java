package com.survivalcoding;

public class Patent extends IntangibleAsset {
    String patentType;

    public Patent(String name, String licenseNumber, String patentType) {
        super(name, licenseNumber);
        this.patentType = patentType;
    }
}
