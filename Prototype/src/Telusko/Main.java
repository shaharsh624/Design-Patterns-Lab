package Telusko;

public class Main {
    public static void main(String[] args) {
        // Book Shop 1
        BookShop bs1 = new BookShop();
        bs1.setShopName("Aadinath Stationary");
        bs1.loadData();

        // Book Shop 2
        BookShop bs2 = (BookShop)bs1.clone();
        bs2.setShopName("Parshwanath Stationary");

        // Remove Book
        bs1.getBooks().remove(2);

        // Book Shop 3
        BookShop bs3 = (BookShop)bs1.clone();
        bs3.setShopName("Munisuvrat Stationary");

        System.out.println(bs1);
        System.out.println(bs2);
        System.out.println(bs3);
    }
}
