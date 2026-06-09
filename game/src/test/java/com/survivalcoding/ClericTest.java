package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClericTest {

    @Test
    @DisplayName("mp -5 & hp max heal")
    void add() {
        //given
        Cleric cleric = new Cleric("아서스", 40, 5);
        Cleric cleric2 = new Cleric("아서스", 35);
        Cleric cleric3 = new Cleric("아서스");
        //Cleric cleric4 = new Cleric();


        //when
        System.out.println(cleric.name);
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);
        System.out.println("===");
        System.out.println(cleric2.name);
        System.out.println(cleric2.hp);
        System.out.println(cleric2.mp);
        System.out.println("===");
        System.out.println(cleric3.name);
        System.out.println(cleric3.hp);
        System.out.println(cleric3.mp);

        //then

    }
}