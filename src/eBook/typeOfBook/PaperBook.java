package eBook.typeOfBook;

import eBook.BookType;

public class PaperBook implements BookType {

    private String fragment;
    private int paperSize;
    private String publishingHouse;

    public PaperBook() {
    }

    public PaperBook(String fragment, int paperSize, String publishingHouse) {
        this.fragment = fragment;
        this.paperSize = paperSize;
        this.publishingHouse = publishingHouse;
    }

    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public int getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(int paperSize) {
        this.paperSize = paperSize;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "fragment='" + fragment + '\'' +
                ", paperSize=" + paperSize +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
