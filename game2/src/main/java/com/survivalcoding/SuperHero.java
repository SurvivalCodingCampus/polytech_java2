package com.survivalcoding;

public class SuperHero extends Hero {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("홍길동", 50);
        superHero.attack();
        superHero.run();
        superHero.setFlying(true);
    }

    private boolean isFlying;

    //상속을 받으면 부모 클래스의 생성자를 반드시 호출해야만 한다.
    public SuperHero(String name, int hp) {
        super(name, hp);
    }


    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void run() {
        System.out.println("매우 빠르게 달렸다.");
    }

    @Override
    void attack() {
        super.attack();
        if (isFlying) {
            System.out.println("한번 더 때려라");
        }
    }
}
