package com.survivalcoding;

public class Patent extends IntangibleAsset {
    private String PatentNum;

    public Patent(String name, String PatentNum) {
        super(name);
        this.PatentNum = PatentNum;
    }

    public String getPatentNum() {
        return PatentNum;
    }

    public void setPatentNum(String patentNum) {
        PatentNum = patentNum;
    }
}

