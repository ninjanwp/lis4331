package skillsets.ss12;
import java.util.Scanner;

import skillsets.ss11.Product;

public class BookDemo {

    public static void getRequirements() {
        System.out.println("Developer: Nicholas Pfeffer");
        System.out.println("Program tests Book class, which inherits from Product class.");
        System.out.println("Instantiates two Product objects and two Book objects:");
        System.out.println("   1) One from each class uses the default (no-argument) constructor");
        System.out.println("   2) One from each class uses the parameterized constructor (user-entered values)");
        System.out.println();
    }

    public static void main(String[] args) {
        getRequirements();

        Scanner sc = new Scanner(System.in);

        // *** Instantiate two Product objects ***

        // 1) product1 using default constructor
        Product product1 = new Product();
        product1.print();
        System.out.println();

        // 2) product2 using parameterized constructor
        System.out.println("Enter data for product2:");
        System.out.print("Enter code: ");
        String code = sc.nextLine();
        System.out.print("Enter description: ");
        String description = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        Product product2 = new Product(code, description, price);
        product2.print();
        System.out.println();

        // *** Instantiate two Book objects ***

        // 1) book1 using default constructor
        Book book1 = new Book();
        book1.print();
        System.out.println();

        // 2) book2 using parameterized constructor
        System.out.println("Enter data for book2:");
        System.out.print("Enter code: ");
        code = sc.nextLine();
        System.out.print("Enter description: ");
        description = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter author: ");
        String author = sc.nextLine();

        Book book2 = new Book(code, description, price, author);
        book2.print();
        System.out.println();
    }
}
