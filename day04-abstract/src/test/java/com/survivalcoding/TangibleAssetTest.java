package com.survivalcoding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TangibleAssetTest {
    @Test
    void GetterSetterTest(){
        Computer com = new Computer();
        com.setWeight(2.5);
        assertEquals(2.5, com.getWeight());
    }
}

