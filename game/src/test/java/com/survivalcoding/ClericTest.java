package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("mp -5 & hp max heal")
    void add() {
        //given
        Cleric cleric = new Cleric();
        //when
        System.out.println(cleric.name); //Cleric
        cleric.selfAid(); //hp max
        cleric.pray(3); //5~8
        cleric.pray(5); //10

        //then
        assertEquals(10, cleric.mp); //10
    }
}