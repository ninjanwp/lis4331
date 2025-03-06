import java.util.Scanner;

public class MeasurementConversion {
    // Developer: Nicholas Pfeffer

    // Conversion constants
    private static final double INCHES_TO_CENTIMETER = 2.54;
    private static final double INCHES_TO_METER = 0.0254;
    private static final double INCHES_TO_FOOT = 1.0 / 12.0;
    private static final double INCHES_TO_YARD = 1.0 / 36.0;
    private static final double FEET_TO_MILE = 1.0 / 5280.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Developer: Nicholas Pfeffer\n");
        System.out.println("Program converts inches to centimeters, meters, feet, yards, and miles.");
        System.out.println("***Notes***:");
        System.out.println("1) Use integer for inches (must validate integer input).");
        System.out.println("2) Use printf() function to print formatted values.");
        System.out.println("3) Create Java \"constants\" for the conversion values.\n");

        int inches = getValidIntegerInput(scanner);

        System.out.printf("\n%d inch(es) equals\n", inches);
        System.out.printf("%.6f centimeter(s)\n", inches * INCHES_TO_CENTIMETER);
        System.out.printf("%.6f meter(s)\n", inches * INCHES_TO_METER);
        System.out.printf("%.6f feet\n", inches * INCHES_TO_FOOT);
        System.out.printf("%.6f yard(s)\n", inches * INCHES_TO_YARD);
        System.out.printf("%.6f mile(s)\n", (inches * INCHES_TO_FOOT) * FEET_TO_MILE);

        scanner.close();
    }

    private static int getValidIntegerInput(Scanner scanner) {
        int inches;
        while (true) {
            System.out.print("\nPlease enter number of inches: ");
            if (scanner.hasNextInt()) {
                inches = scanner.nextInt();
                break;
            } else {
                System.out.println("Not valid integer!");
                scanner.next(); // Clear invalid input
            }
        }
        return inches;
    }
}
