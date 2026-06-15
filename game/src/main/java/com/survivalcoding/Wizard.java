package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;


    Wizard(String name, int hp, int mp, Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 필수로 있어야 합니다.");
        }
        this.name = name;
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
        this.mp = mp;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public int getWizardHp() {
        return hp;
    }

    public void setWizardHp(int hp) {
        this.hp = hp;
    }

    public int getWizardMp() {
        return mp;
    }

    public void setWizardMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0이상이어야 한다.");
        }
        this.mp = mp;
    }

    public String getWizardName() {
        return name;
    }

    public void setWizardName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("마법사의 이름을 반드시 입력해야 합니다.");
        }
        if (name.length() <= 2) {
            throw new IllegalArgumentException("마법사의 이름은 반드시 3문자 이상이어야 한다.");
        }
        this.name = name;
    }

    void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getWandPower());
        hero.setHp(hero.getHp() + recovPoint);
    }
}
