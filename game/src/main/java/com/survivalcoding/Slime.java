package com.survivalcoding;

public class Slime {
    final String suffix; //suffix은 슬라임 이름
    int hp;

    public Slime(String suffix) {
        this.suffix = suffix; //값이 초기화 된 부모 생성자 ▶ 자식 클랙스에서 빨간 줄 없이 잘 굴러감
    }

    void attack(Hero hero) {
        System.out.println("==========================");
        System.out.println("슬라임 " + suffix + " 이(가) 공격했다");
        System.out.println("10 의 데미지");
        hero.setHp(hero.getHp() - 10);
        System.out.println("--------------------------");
    }
}
