package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class examCollectionTest {

    @Test
    void setCities() {
        examCollection examCollection = new examCollection();

        examCollection.setCities();

        assertEquals(3, examCollection.cities.size());
        assertTrue(examCollection.cities.contains("서울"));
        assertTrue(examCollection.cities.contains("대전"));
        assertTrue(examCollection.cities.contains("부산"));
    }

    @Test
    void setScores() {
        examCollection examCollection = new examCollection();

        examCollection.setScores();

        assertEquals(3, examCollection.scores.size());
        assertEquals(100, examCollection.scores.get(0));
        assertEquals(80, examCollection.scores.get(1));
        assertEquals(100, examCollection.scores.get(2));
    }

    @Test
    void setCityPopulation() {
        examCollection examCollection = new examCollection();

        examCollection.setCityPopulation();

        assertEquals(3, examCollection.cityPopulation.size());
        assertEquals(10000000, examCollection.cityPopulation.get("서울"));
        assertEquals(2000000, examCollection.cityPopulation.get("대전"));
        assertEquals(4000000, examCollection.cityPopulation.get("부산"));
    }
}