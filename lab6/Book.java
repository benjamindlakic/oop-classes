package lab6;

public class Book {
    private String title;
    private String publisher;
    private int publishingYear;
    public Book(String title, String publisher, int year){
        this.title=title;
        this.publisher=publisher;
        this.publishingYear=year;
    }
    public String title() {
        return title;
    }
    public String publisher() {
        return publisher;
    }
    public int year() {
        return publishingYear;
    }
    
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.publishingYear;
    }
    
}
