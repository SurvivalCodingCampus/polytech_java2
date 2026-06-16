package com.survivalcoding;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("지팡이의 이름은 null일 수 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("지팡이의 이름은 반드시 3문자 이상이어야 한다.");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5이상 100.0이하여야 합니다.");
        }
        this.power = power;
    }
}
