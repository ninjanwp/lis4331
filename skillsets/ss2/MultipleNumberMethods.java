package skillsets.ss2;

import java.util.Scanner;

public class MultipleNumberMethods
{
    public static void getRequirements()
    {
        System.out.println("Program Name: MultipleNumber");
        System.out.println("Program determines if the first number is a multiple of the second and prints the result.");
        System.out.println("Example: 2, 4, 6, 8 are multiples of 2.");
        System.out.println("1) Use integers. 2) Use printf() to print results.");
        System.out.println("Must *only* permit integer entry.");
        System.out.println("Developer: Nicholas Pfeffer\n");
    }

    // Helper method to safely get an integer from user
    public static int getInteger(Scanner sc, String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            try
            {
                return Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not valid integer!\n");
                System.out.println("Please try again.");
            }
        }
    }

    public static void runProgram()
    {
        Scanner sc = new Scanner(System.in);

        int num1 = getInteger(sc, "Num1: ");
        int num2 = getInteger(sc, "Num2: ");

        // Check multiple
        if (num2 != 0 && num1 % num2 == 0)
        {
            System.out.printf("\n%d is a multiple of %d\n", num1, num2);
        }
        else
        {
            System.out.printf("\n%d is not a multiple of %d\n", num1, num2);
        }

        // Print product
        int product = num1 * num2;
        System.out.printf("The product of %d and %d is %d\n", num1, num2, product);
    }
}
