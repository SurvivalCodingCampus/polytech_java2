public class Book extends TangibleAsset implements Thing {
    private String isbn;

    //생성자 ..상속포함
    Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

}


