package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    // 1. FileUtil 클래스의 getPath() 메서드 테스트
    @Test
    void testGetPath() {
        // 준비 (Given)
        FileUtil fileUtil = new FileUtil();

        // 실행 (When)
        // 경우 1: 폴더명 끝에 백슬래시(\)가 없는 경우
        String result1 = fileUtil.getPath("C:\\dev", "abc.txt");
        // 경우 2: 폴더명 끝에 백슬래시(\)가 이미 있는 경우
        String result2 = fileUtil.getPath("C:\\dev\\", "abc.txt");

        // 검증 (Then)
        // assertEquals(기대하는 정답, 실제 결과값)을 사용하여 두 값이 같은지 확인합니다.
        assertEquals("C:\\dev\\abc.txt", result1, "백슬래시가 없으면 추가해서 결합해야 합니다.");
        assertEquals("C:\\dev\\abc.txt", result2, "백슬래시가 이미 있으면 그대로 결합해야 합니다.");
    }

    // 2. Main 클래스에 있던 1~100 문자열 배열 생성 로직 테스트
    @Test
    void testStringSplitLogic() {
        // 준비 & 실행 (Given & When)
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }
        String str = sb.toString();
        String[] a = str.split(",");

        // 검증 (Then)
        assertEquals(100, a.length, "배열의 길이는 100이어야 합니다.");
        assertEquals("1", a[0], "배열의 첫 번째 요소는 '1'이어야 합니다.");
        assertEquals("100", a[99], "배열의 마지막 요소는 '100'이어야 합니다.");
    }
}