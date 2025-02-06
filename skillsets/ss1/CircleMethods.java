import java.util.Scanner;

public class CircleMethods
{
    public static void getRequirements()
    {
        System.out.println("Program Name: Circle");
        System.out.println("This program calculates diameter, circumference, and circle area.");
        System.out.println("Must use Java's built-in PI constant, printf(), and format to 2 decimal places.");
        System.out.println("Must *only* permit numeric entry.");
        System.out.println("Developer: Nicholas Pfeffer\n");
    }

    public static void calculateCircle()
    {
        Scanner sc = new Scanner(System.in);
        double radius = 0.0;
        boolean valid = false;

        // Keep prompting user until we have a valid numeric radius
        while(!valid)
        {
            System.out.print("Enter circle radius: ");
            try
            {
                radius = Double.parseDouble(sc.nextLine());
                valid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not valid number!\n");
                System.out.println("Please try again.");
            }
        }

        // Perform calculations
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        // Print results formatted to 2 decimal places
        System.out.printf("\nCircle diameter: %.2f\n", diameter);
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }
}
