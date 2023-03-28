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





}
