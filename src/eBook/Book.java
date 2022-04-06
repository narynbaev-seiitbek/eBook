package eBook;

import java.util.List;

public class Book <T extends BookType>{

    private T book;
    private List<FileInfo> images;
    private String bookName;
    private String bookAuthor;
    private int prise;
    private int likes;

    public Book() {
    }

    public Book(T book, List<FileInfo> images, String bookName, String bookAuthor, int prise, int likes) {
        this.book = book;
        this.images = images;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.prise = prise;
        this.likes = likes;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }

    public List<FileInfo> getImages() {
        return images;
    }

    public void setImages(List<FileInfo> images) {
        this.images = images;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void like() {
        this.likes++;
    }

    public void disLike() {
        this.likes--;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book=" + book +
                ", images=" + images +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", prise=" + prise +
                ", likes=" + likes +
                '}';
    }


}
