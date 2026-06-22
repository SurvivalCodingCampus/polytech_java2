package com.survivalcoding.day260616;

public abstract class Wizard {
    private int mp = 100;

    public Wizard(int mp) {
        setMp(mp);
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP은 0이상여야 합니다.");
        }
        this.mp = mp;
    }

    public void heal(Hero hero){
        int recovPoint = 20;

        if(getMp() < 10 ){
            System.out.println("마나가 부족합니다");
            return;
        }
        else{
            hero.setHp(hero.getHp() + recovPoint);
            setMp(getMp() - 10);
            System.out.println("힐을 시전했습니다. 대상 HP : " + hero.getHp());
        }
    }




}
