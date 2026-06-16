package com.survivalcoding.day260616;

public class Slime {
    final String suffix = "slime";
    private String name;
    private int hp = 40;

    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    void attack(Hero hero){
        System.out.println("슬라임" + suffix +"이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }

    public Slime(String name){
        this.name = name;
    }
}
