package com.survivalcoding.day260616;

public class Hero {
    private String name = "김영웅";
    private int hp = 100;
    private int maxHP = 150;

    public Hero() {
    }


    public void attack(Slime slime){
        System.out.println(name + "이 공격했다.");
        hp -= 10;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void run(){
        System.out.println(name + "이 도망쳤다.");
    }

    public Hero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public final void slip(){
        hp -= 5;
        System.out.println(name + "는 미끄러졌다!");
        System.out.println("5의 데미지!");
    }

    public int getMaxHp() {
        return this.maxHP;
    }
}
