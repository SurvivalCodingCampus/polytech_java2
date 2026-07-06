package com.survivalcoding.day260706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Regular_ExpressionTest {

    private static final int EXPECTED_ARRAY_SIZE = 100;

    @Test
    void testRegularExpression() {
        Regular_Expression regExp = new Regular_Expression();

        regExp.setRegular_Expression();

        System.out.print("실제 출력 결과: ");
        regExp.getRegular_Expression();

        String[] resultArr = regExp.getStrArr();

        assertNotNull(resultArr, "배열이 생성되지 않고 null입니다.");
        assertEquals(EXPECTED_ARRAY_SIZE, resultArr.length, "배열의 크기가 100이 아닙니다.");
    }
}