package com.survivalcoding;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null 일 수는 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이여야 합니다.");

        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5) {
            power = 0.5;
        } else if (power > 100.0) {
            power = 100.0;
        }
        this.power = power;
    }
}
