package com.survivalcoding;

public class Computer extends TangibleAsset {
    private String markerName;

    public Computer(String name, int price, String color, String markerName) {
        super(name, price, color);
        this.markerName = markerName;
    }

    public String getMarkerName() {
        return markerName;
    }

    public void setMarkerName(String markerName) {
        this.markerName = markerName;
    }

    @Override
    public double weight() {
        return super.getWeight();
    }

    @Override
    public void setweight(double weight) {

    }
}
