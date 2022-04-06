package eBook;

import java.util.List;

public class Vendor {

    private String vendorName;
    private String vendorEmail;
    private int phoneNumber;
    private List<Book> bookToSale;

    public Vendor() {
    }

    public Vendor(String vendorName, String vendorEmail, int phoneNumber, List<Book> bookToSale) {
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.phoneNumber = phoneNumber;
        this.bookToSale = bookToSale;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBookToSale() {
        return bookToSale;
    }

    public void setBookToSale(List<Book> bookToSale) {
        this.bookToSale = bookToSale;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "vendorName='" + vendorName + '\'' +
                ", vendorEmail='" + vendorEmail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", bookToSale=" + bookToSale +
                '}';
    }
}
