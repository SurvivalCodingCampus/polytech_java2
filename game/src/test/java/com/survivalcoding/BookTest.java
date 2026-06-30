package com.survivalcoding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookTest {

    //    private Book book;
//
//    @BeforeEach
//    void setUp() {
//        book = new Book("Clean Code", 35000, "Blue", 0.6, "Book", "978-0132350884");
//    }
//
//    @Test
//    @DisplayName("생성자로 전달한 값들이 모두 정상적으로 반영된다")
//    void constructorSetsAllFields() {
//        assertEquals("Clean Code", book.getName());
//        assertEquals(35000, book.getPrice());
//        assertEquals("Blue", book.getColor());
//        assertEquals(0.6, book.getWeight(), 0.0001);
//        assertEquals("Book", book.getAssetType());
//        //assertEquals("978-0132350884", book.getIsbn());
//    }
//
//    @Test
//    @DisplayName("Book은 Asset이면서 Thing이다")
//    void bookIsAssetAndThing() {
//        assertTrue(book instanceof Asset);
//        assertTrue(book instanceof Thing);
//    }
//
//    @Nested
//    @DisplayName("Book 고유 필드 (isbn)")
//    class IsbnTests {
//
//        @Test
//        @DisplayName("isbn을 변경하면 변경된 값이 조회된다")
//        void setAndGetIsbn() {
//            //book.setIsbn("978-1234567890");
//            //assertEquals("978-1234567890", book.getIsbn());
//        }
//    }
//
//    @Nested
//    @DisplayName("TangibleAsset으로부터 상속된 동작")
//    class TangibleAssetTests {
//
//        @Test
//        @DisplayName("price를 변경하면 변경된 값이 조회된다")
//        void setAndGetPrice() {
//            book.setPrice(42000);
//            assertEquals(42000, book.getPrice());
//        }
//
//        @Test
//        @DisplayName("name을 변경하면 변경된 값이 조회된다")
//        void setAndGetName() {
//            book.setName("Effective Java");
//            assertEquals("Effective Java", book.getName());
//        }
//
//        @Test
//        @DisplayName("color를 변경하면 변경된 값이 조회된다")
//        void setAndGetColor() {
//            book.setColor("Red");
//            assertEquals("Red", book.getColor());
//        }
//
//        @Test
//        @DisplayName("Thing 타입으로 다뤄도 setWeight/getWeight가 동일한 weight를 가리킨다")
//        void weightIsConsistentThroughThingInterface() {
//            Thing thing = book;
//            thing.setWeight(1.2);
//
//            assertEquals(1.2, thing.getWeight(), 0.0001);
//            assertEquals(1.2, book.getWeight(), 0.0001);
//        }
//    }
//
//    @Nested
//    @DisplayName("Asset으로부터 상속된 동작")
//    class AssetTests {
//
//        @Test
//        @DisplayName("assetType을 변경하면 변경된 값이 조회된다")
//        void setAndGetAssetType() {
//            book.setAssetType("Novel");
//            assertEquals("Novel", book.getAssetType());
//        }
//    }
    @Test
    void given() {

        Book book = new Book("title", 2023 - 1 - 1, "comment");

        List<Book> books = new ArrayList<>();
        books.add(new Book("dff", 2026 - 1 - 30, "comments"));
        books.add(new Book("dff", 2026 - 1 - 30, "comments"));
        books.add(new Book("acdc", 2026 - 1 - 12, "comments"));
        // 오름차순
//        Collections.sort(heroes);

        // 내림차순, 익명클래스
        //Collections.sort(books);

        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle()) * -1;
            }
        });
        Collections.sort(books, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

    }

}