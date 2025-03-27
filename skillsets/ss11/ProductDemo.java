package skillsets.ss11;
import java.util.Scanner;

public class ProductDemo {

    public static void getRequirements() {
        System.out.println("Developer: Nicholas Pfeffer");
        System.out.println("Program tests Product class by instantiating two objects:");
        System.out.println("   1) One object uses the default (no-argument) constructor");
        System.out.println("   2) One object uses the parameterized constructor (user-entered values)");
        System.out.println();
    }

    public static void main(String[] args) {
        getRequirements();

        // 1) Instantiate product1 using default constructor
        Product product1 = new Product();
        product1.print();
        System.out.println();

        // 2) Instantiate product2 using parameterized constructor with user-entered data
        Scanner sc = new Scanner(System.in);

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
    }
}
