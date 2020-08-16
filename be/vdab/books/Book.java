package be.vdab.books;

public class Book {

    // data fields
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // constructors
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // getters & setters
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    // toString method
    public String toString() {
        return "Book[name=" + getName() + "," + author.toString() + ",price=" + getPrice() + ",qty=" + getQty() + "]";
    }
}
