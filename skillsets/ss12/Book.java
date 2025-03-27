package skillsets.ss12;

import skillsets.ss11.Product;

public class Book extends Product {
    private String author;

    // no-argument (no-par) constructor
    public Book() {
        // Note: base (Product) default constructor is automatically called
        System.out.println("Inside book default constructor.");
        author = "Unknown Author";
    }

    // parameterized constructor that accepts four arguments
    public Book(String code, String description, double price, String author) {
        // Call the base class (Product) parameterized constructor
        super(code, description, price);
        System.out.println("Inside book constructor with parameters.");
        this.author = author;
    }

    // setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter
    public String getAuthor() {
        return author;
    }

    // override print method
    @Override
    public void print() {
        // First, call base class print to display code, description, price
        super.print();
        // Then display author
        System.out.println("Author: " + author);
    }
}
