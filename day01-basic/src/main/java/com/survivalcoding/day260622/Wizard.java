package com.survivalcoding.day260622;

public class Wizard extends Hero implements Attackable, Healable {
    private double power;
    private int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int myHp) {
        this.hp = myHp;
    }

    public void fireball(Hero hero) {

    }

    public Wizard(String name, int hp){
        super(name, hp);
    }

    @Override
    public void heal(Hero hero){

    }

}
