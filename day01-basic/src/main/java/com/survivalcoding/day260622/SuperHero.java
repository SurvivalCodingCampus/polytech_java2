package com.survivalcoding.day260622;

import com.survivalcoding.day260616.Slime;

// SuperHero : subclass
// Hero : super class
public class SuperHero extends Hero {

    private boolean isFlying;

    // 상속을 받으면 반드시 부모(super) 클래스의 생성자를 반드시 호출해야만 한다
    public SuperHero(String name, int hp) {
        super(name, hp);
    }

    public static void main(String[] args) {
//        SuperHero superHero = new SuperHero();
        SuperHero superHero = new SuperHero("홍길동", 50);
        Slime slime = new Slime("Slime");
        superHero.run();
        superHero.setFlying(true);
        superHero.attack(slime);
    }

//    public SuperHero() {
//        System.out.println("SuperHero 생성자 호출");
//    }
//
//    public SuperHero(String name, int hp) {
//        super(name, hp);
//    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    // 어노테이션 (주석)
    @Override
    public void run() {
        System.out.println("매우 빠르게 달렸다");
    }

    @Override
    public void attack(Slime slime) {
        super.attack(slime);
        if (isFlying) {
            System.out.println("한번 더 때려");
        }
    }

}
