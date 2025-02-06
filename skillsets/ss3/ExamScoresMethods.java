package skillsets.ss3;

import java.util.Scanner;

public class ExamScoresMethods
{
    public static void getRequirements()
    {
        System.out.println("Program Name: ExamScores");
        System.out.println("Program counts, totals, and averages user‐entered exam scores.");
        System.out.println("Please enter exam scores between 0 and 100, inclusive.");
        System.out.println("Enter an out‐of‐range number to end the program.");
        System.out.println("Must *only* permit numeric entry.");
        System.out.println("Developer: Nicholas Pfeffer\n");
    }

    // Helper method to read an integer score or detect invalid input
    public static int getScore(Scanner sc)
    {
        while (true)
        {
            System.out.print("Enter exam score: ");
            try
            {
                return Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Not valid number!\n");
                System.out.println("Please try again.");
            }
        }
    }

    public static void runProgram()
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int total = 0;

        while (true)
        {
            int score = getScore(sc);
            // If score is outside [0..100], break out of the loop
            if (score < 0 || score > 100)
            {
                break;
            }
            // Accumulate count and total
            count++;
            total += score;
        }

        // Print results
        System.out.printf("\nCount: %d\n", count);
        System.out.printf("Total: %.2f\n", (double) total);
        double average = (count > 0) ? (double) total / count : 0.0;
        System.out.printf("Average: %.2f\n", average);
    }
}
