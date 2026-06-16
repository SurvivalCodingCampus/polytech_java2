package com.survivalcoding.day260615.game;

public class Wand {
    private String name;
    private double power;

    public double getPower(){
        return power;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("지팡이 이름은 null일 수 없고 3문자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 합니다.");
        }
        this.power = power;
    }

}
