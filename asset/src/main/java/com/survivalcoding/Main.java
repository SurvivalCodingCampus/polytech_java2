package com.survivalcoding;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("aa", 100, "red", "1111", 10.0);
        Computer computer = new Computer("맥북", 200000, "red", "1111", 20.0);

        Thing thing1 = book;
        Thing thing2 = computer;

        List<Thing> books = new ArrayList<>();
        books.add(book);
        books.add(computer);

        System.out.println(books.get(0).getWeight());

        TangibleAsset tangibleAsset1 = book;
        TangibleAsset tangibleAsset2 = computer;

        Asset asset1 = book;
        Asset asset2 = computer;

        if (thing2 instanceof Book) {
            Book book2 = (Book) thing2;
        }
    }
}