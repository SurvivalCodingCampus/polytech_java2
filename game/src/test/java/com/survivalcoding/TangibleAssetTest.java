package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TangibleAssetTest {
    @Test
    void TangibleAssetTest() {
        Computer c = new Computer("mac", 100, "pink", "macisbn");
        Book b = new Book("macBook", 50, "pinkPink", "mackBookisbn");
        Patent p = new Patent("patentPatent", "patent1");

        c.setWeight(10);
        assertEquals(10, c.getWeight());

        b.setWeight(5);
        assertEquals(5, b.getWeight());
    }
}