package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ATest {

    @Test
    @DisplayName("형변환 후 리스트")
    void ListType() {
        A a = new A();
        B b = new B();

        Y y1 = a;
        Y y2 = b;

        List<Y> listTest = new ArrayList<>();

        listTest.add(new A());
        listTest.add(new B());

        for (Y y : listTest) {
            y.b();
        }
    }

}