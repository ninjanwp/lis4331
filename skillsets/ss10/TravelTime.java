import java.util.Scanner;

public class TravelTime {

    public static void getRequirements() {
        System.out.println("Developer: Nicholas Pfeffer");
        System.out.println("Program calculates approximate travel time.");
        System.out.println("Must perform data validation:");
        System.out.println("   - Miles must be > 0 and no more than 3000.");
        System.out.println("   - MPH must be between 1 and 100.");
        System.out.println("Accepts decimal input for miles and mph.");
        System.out.println("Displays approximate hours and minutes.");
        System.out.println();
    }

    public static void calculateTravelTime() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            double miles = 0;
            double mph = 0;

            // Validate miles
            do {
                System.out.print("Enter miles: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid input. Please enter numeric value for miles: ");
                    sc.next();
                }
                miles = sc.nextDouble();
                if (miles <= 0 || miles > 3000) {
                    System.out.println("Miles must be between 1 and 3000. Please try again.");
                }
            } while (miles <= 0 || miles > 3000);

            // Validate mph
            do {
                System.out.print("Enter mph: ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Invalid input. Please enter numeric value for mph: ");
                    sc.next();
                }
                mph = sc.nextDouble();
                if (mph < 1 || mph > 100) {
                    System.out.println("MPH must be between 1 and 100. Please try again.");
                }
            } while (mph < 1 || mph > 100);

            // Calculate approximate travel time
            int totalMinutes = (int) Math.round((miles / mph) * 60);
            int hours = totalMinutes / 60;
            int minutes = totalMinutes % 60;

            System.out.println("Estimated travel time: " + hours + " hr(s) " + minutes + " min(s)");

            // Prompt to continue
            System.out.print("Continue? (y/n): ");
            sc.nextLine(); // consume leftover newline
            choice = sc.nextLine();
        }

        System.out.println("Thank you for using this program!");
    }

    public static void main(String[] args) {
        getRequirements();
        calculateTravelTime();
    }
}
