package skillsets.ss11;
import java.text.DecimalFormat;

public class Product {
    private String code;
    private String description;
    private double price;

    // no-argument (no-par) constructor
    public Product() {
        System.out.println("Inside product default constructor.");
        // Set default values (as shown in screenshot)
        code = "abc123";
        description = "My Widget";
        price = 49.99;
    }

    // parameterized constructor
    public Product(String code, String description, double price) {
        System.out.println("Inside product constructor with parameters.");
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // setter (mutator) methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // getter (accessor) methods
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    // Format the price
    public String getPrice() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "$" + df.format(price);
    }

    // print method to display all fields
    public void print() {
        System.out.println("Code: " + code + ", Description: " + description + ", Price: " + getPrice());
    }
}