package com.survivalcoding;

import java.util.ArrayList;
import java.util.List;

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


        Book book1 = new Book("어린왕자", "2024-01-01", "대여중");
        Book book2 = new Book("별헤는밤", "1991-05-02", "대여중");
        System.out.println(book1);
        System.out.println(book2);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        System.out.println(bookList);

    }
}