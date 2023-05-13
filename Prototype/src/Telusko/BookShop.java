package Telusko;

import java.util.*;

public class BookShop implements Cloneable {
    String ShopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String toString() {
        return "\nBookShop{ " +
                "ShopName='" + ShopName + '\'' +
                ",\nbooks=" + books +
                "\n}";
    }

    public void loadData() {
        for (int i=1; i<=5 ; i++) {
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book " + i);
            getBooks().add(b);
        }
    }

    protected Object clone() {
        BookShop bs = new BookShop();
        for (Book book : this.getBooks()) {
            bs.getBooks().add(book);
        }
        return bs;
    }
}
