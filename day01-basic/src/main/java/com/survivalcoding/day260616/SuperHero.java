package com.survivalcoding.day260616;

public class SuperHero extends Hero {
    private boolean isFlying;

    public SuperHero(String name, int hp){
        super(name, hp);
    }

    public boolean isFlying(){
        return isFlying;
    }

    public void setFlying(boolean flying){
        isFlying = flying;
    }

    @Override
    public void run(){
        System.out.println("멋지게 퇴각했다.");
    }

    @Override
    public void attack(Slime slime){
        super.attack(slime);
        if(isFlying){
            slime.setHp(slime.getHp() - 5);
            System.out.println("5포인트의 추가 피해를 입혔따");
        }
    }
}
