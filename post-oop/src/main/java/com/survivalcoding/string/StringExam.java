package com.survivalcoding.string;

public class StringExam {
    public static void main(String[] args) {
//        stringBuilderAdd();

        String str1 = "hello";  // 컴파일타임 상수
        String str2 = "hello";
        String str3 = "he" + "llo";

        String llo = "llo";

        // 런타임
        String str4 = "he" + llo;

        // 인스턴스 갯수
        System.out.println(str1 == str4);   // ?
    }

    public static void stringBuilderAdd() {
        StringBuilder sb = new StringBuilder("!");

        // text 의 값이 바뀐거냐.
        sb.append("hello");


        // 100만번 : 180ms
        for (int i = 0; i < 1000000; i++) {
            sb.append("!");
        }

        System.out.println(sb.toString().length());  // 10000
    }

    public static void stringAdd() {
        String text = "!";

        // text 의 값이 바뀐거냐.
        text = new String(text + new String("hello"));


        // 1만번 : 159ms
        // 10만번 : 490ms
        // 100만번 : 23초
        for (int i = 0; i < 1000000; i++) {
            text += "!";
        }

        System.out.println(text.length());  // 10000
    }
}
