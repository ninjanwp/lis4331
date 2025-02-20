import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Methods {
    // Constants
    public static final int SECS_IN_MIN = 60;
    public static final int MINS_IN_HR = 60;
    public static final int HRS_IN_DAY = 24;
    public static final int DAYS_IN_WEEK = 7;
    public static final int DAYS_IN_YR = 365;

    public static void getRequirements() {
        System.out.println("Program converts seconds to minutes, hours, days, weeks, and years.");
        System.out.println("***Notes***:");
        System.out.println("1) Use integer for seconds (must validate integer input).");
        System.out.println("2) Use printf() function to format values as below.");
        System.out.println("3) Create Java \"constants\" for:");
        System.out.println("   SECS_IN_MIN, MINS_IN_HR, HRS_IN_DAY, DAYS_IN_WEEK, DAYS_IN_YR (365 days)");
        System.out.println("\nDeveloper: Nicholas Pfeffer\n");
    }

    public static int validateInput() {
        Scanner scanner = new Scanner(System.in);
        int seconds;

        while (true) {
            System.out.print("Please enter number of seconds: ");
            if (scanner.hasNextInt()) {
                seconds = scanner.nextInt();
                if (seconds >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Not a valid integer!");
                scanner.next(); // Consume invalid input
            }
        }
        scanner.close();
        return seconds;
    }

    public static void convertSeconds(int seconds) {
        NumberFormat formatter = NumberFormat.getInstance(Locale.US); // Formats numbers with commas

        System.out.printf("%s second(s) equals\n", formatter.format(seconds));
        
        long minutes = seconds / SECS_IN_MIN;
        long hours = minutes / MINS_IN_HR;
        long days = hours / HRS_IN_DAY;
        double weeks = (double) days / DAYS_IN_WEEK;
        double years = (double) days / DAYS_IN_YR;

        System.out.printf("%s minute(s)\n", formatter.format(minutes));
        System.out.printf("%s hour(s)\n", formatter.format(hours));
        System.out.printf("%s day(s)\n", formatter.format(days));
        System.out.printf("%.5f week(s)\n", weeks);
        System.out.printf("%.6f year(s)\n", years);
    }
}
