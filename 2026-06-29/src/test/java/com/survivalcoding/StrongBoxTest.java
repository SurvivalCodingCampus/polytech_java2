package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StrongBoxTest {

    @Test
    void 금고에_아이템을_넣고_꺼내면_동일한_아이템이_반환되어야_한다() {
        // Given
        StrongBox<String> box = new StrongBox<>();
        String expectedItem = "보물지도";

        // When
        box.put(expectedItem);
        String actualItem = box.get();

        // Then
        assertEquals(expectedItem, actualItem, "금고에서 꺼낸 아이템은 넣은 아이템과 같아야 합니다.");
    }

    @Test
    void 금고에_아무것도_넣지_않고_꺼내면_null이_반환되어야_한다() {
        // Given
        StrongBox<Integer> emptyBox = new StrongBox<>();

        // When
        Integer result = emptyBox.get();

        // Then
        assertNull(result, "초기 상태의 금고는 null을 반환해야 합니다.");
    }
}