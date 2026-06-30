package com.survivalcoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StrongBox<String> stringBox = new StrongBox<>(KeyType.PADLOCK);
        stringBox.put("PADLOCK 편지");

        for (int i = 0; i < 1024; i++) {
            stringBox.get();
        }

        System.out.println("현재 상태: " + stringBox.get());

    }
}