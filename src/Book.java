import java.util.Objects;

public class Book {
    private String bookName;
    private String toString;
    private int publishingYear;


    public Book(String bookName, Author author, int publishingYear) {
        this.bookName=bookName;
        this.toString=toString;
        this.publishingYear=publishingYear;

    }
    public String getBookName() {
        return this.bookName;
    }
    public  String getString() {
        return this.toString;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", toString='" + toString + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(toString, book.toString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, toString, publishingYear);
    }
}
