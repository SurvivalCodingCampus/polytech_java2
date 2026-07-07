package com.survivalcoding.day260706;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathTest {

    private static final String FILE_NAME = "abc.txt";
    private static final String PATH_WITHOUT_SLASH = "C:\\dev";
    private static final String PATH_WITH_SLASH = "C:\\dev\\";
    private static final String EXPECTED_TOTAL_PATH = "C:\\dev\\abc.txt";

    @Test
    void getPath() {
        Path pathUtil = new Path();

        String result1 = pathUtil.getPath(PATH_WITHOUT_SLASH, FILE_NAME);
        assertEquals(EXPECTED_TOTAL_PATH, result1, "백슬래시가 없는 경로 결합 실패");

        String result2 = pathUtil.getPath(PATH_WITH_SLASH, FILE_NAME);
        assertEquals(EXPECTED_TOTAL_PATH, result2, "백슬래시가 있는 경로 결합 실패");
    }
}