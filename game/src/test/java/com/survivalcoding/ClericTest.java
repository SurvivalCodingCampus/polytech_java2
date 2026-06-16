package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(cleric2.name, cleric2.hp);
        assertEquals(cleric3.name, cleric3.hp);
        assertEquals(cleric.name, cleric.hp);


        //then

    }
}