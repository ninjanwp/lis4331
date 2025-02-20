import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Methods {
    public static final double COVERAGE_PER_GALLON = 350.0; // Square feet per gallon

    public static void showInstructions() {
        JOptionPane.showMessageDialog(null, 
            "Developer: Nicholas Pfeffer.\n" +
            "Program uses Java GUI message and input dialogs.\n" +
            "Program determines paint cost per room (i.e., \"area\").\n" +
            "For paint \"area\" simplicity: use length X height X 2 + width X height X 2.\n" +
            "Format numbers as per below: thousand separator, decimal point, and $ sign for currency.\n" +
            "Research how many square feet a gallon of paint covers.\n" +
            "Note: Program performs data validation.",
            "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static double getValidatedDouble(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, message, "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
            
            if (input == null) {
                System.exit(0); // Exit if user cancels
            }

            try {
                double value = Double.parseDouble(input);
                if (value > 0) {
                    return value;
                } else {
                    JOptionPane.showMessageDialog(null, "Value must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Not a valid value. " + message, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void calculatePaintCost(double pricePerGallon, double length, double width, double height) {
        double area = (length * height * 2) + (width * height * 2);
        double gallonsRequired = area / COVERAGE_PER_GALLON;
        double totalCost = gallonsRequired * pricePerGallon;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

        String output = "Paint = " + currencyFormat.format(pricePerGallon) + " per gallon.\n" +
                        "Area of room/house = " + decimalFormat.format(area) + " sq ft.\n" +
                        "Total = " + currencyFormat.format(totalCost);

        JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
