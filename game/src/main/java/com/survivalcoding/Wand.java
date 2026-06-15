package com.survivalcoding;

public class Wand {
    private String name;
    private double power;


    Wand(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public String getWandName() {
        return name;
    }

    public void setWandName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("지팡이의 이름을 반드시 입력해야 합니다.");
        }
        if (name.length() <= 2) {
            throw new IllegalArgumentException("지팡이 이름은 반드시 3문자 이상이어야 한다.");
        }
        this.name = name;
    }

    public double getWandPower() {
        return power;
    }

    public void setWandPower(double power) {
        if (power <= 0.5 || power >= 100) {
            throw new IllegalArgumentException("지팡이 마력은 0.5이상 100.0 이하여야 한다.");
        }
        this.power = power;
    }
}
