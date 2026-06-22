package com.survivalcoding;

public class SuperHero extends Hero {
    private boolean isFlying;

    public static void main(String[] args) {
        SuperHero superHero = new SuperHero();
        superHero.heroRun();


    }

    public void attack(int age) {
        if (isFlying) {
            System.out.println("한번더");
        }
        super.attack();
    }
}
