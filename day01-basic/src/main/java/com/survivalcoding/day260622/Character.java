package com.survivalcoding.day260622;

import com.survivalcoding.day260608.Kinoko;

public abstract class Character {
    String name;
    int hp;
    public void run(){
        System.out.println(name + "은 도망쳤다");
    }

    public abstract void attack(Kinoko kinoko);
}
