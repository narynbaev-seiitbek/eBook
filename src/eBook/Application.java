package eBook;

public class Application {

    public static void like(Client client, Book<?> book) {
        client.likedABook(Book);
        book.like();
    }
}
