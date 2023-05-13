package Telusko;

public class Book {
    int bookId;
    String bookName;

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public String toString() {
        return "\n\tBook{ " +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                " }";
    }
}
