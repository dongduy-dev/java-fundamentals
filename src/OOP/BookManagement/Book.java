package OOP.BookManagement;

public class Book {
    private String title;
    private double price;
    private int publishYear;
    private Author author;

    public Book(String title, double price, int publishYear, Author author) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publishYear=" + publishYear +
                ", author=" + author +
                ']';
    }

    public void printTitle(){
        System.out.println(title);
    }

    public boolean checkSameYear(Book book){
        return (this.publishYear == book.getPublishYear());
    }

    public double priceAfterDiscount(double x){
        return (this.price - (this.price * x / 100.0));
    }
}
