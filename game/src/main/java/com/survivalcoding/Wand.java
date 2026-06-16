package com.survivalcoding;

public class Wand {
    String name;
    double power;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100){
            throw new IllegalArgumentException("마력의 범위를 벗어남");
        }
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");

        }
        if(name.length() <= 2){
            throw new IllegalArgumentException("이름이 짧음");
        }
        this.name = name;
    }
}
