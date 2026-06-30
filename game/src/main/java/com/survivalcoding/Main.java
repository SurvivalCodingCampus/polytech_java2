package com.survivalcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("title", 2023 - 1 - 1, "comment");

        List<Book> books = new ArrayList<>();
        books.add(new Book("dff", 2026 - 1 - 30, "comments"));
        books.add(new Book("dff", 2026 - 1 - 30, "comments"));
        books.add(new Book("acdc", 2026 - 1 - 12, "comments"));
        // 오름차순
//        Collections.sort(heroes);

        // 내림차순, 익명클래스
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle()) * -1;
            }
        });
        Collections.sort(books, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

    }
}