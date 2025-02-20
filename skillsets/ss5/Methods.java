import javax.swing.*;

public class Methods {
    public static void showInstructions() {
        JOptionPane.showMessageDialog(null, 
            "Developer: Nicholas Pfeffer.\n"
          + "Program uses Java GUI message and input dialogs.\n"
          + "Program evaluates integers as even or odd.\n"
          + "Note: Program *does* perform data validation,\n"
          + "prompting user until correct data entered.", 
            "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int getValidatedInteger() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Enter integer:", 
                "Number Test Dialog", JOptionPane.INFORMATION_MESSAGE);
            
            if (input == null) {
                System.exit(0); // Exit if user cancels
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, 
                    "Invalid integer. Please enter an integer.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void evaluateNumber(int number) {
        String result = number + (number % 2 == 0 ? " is an even number." : " is an odd number.");
        JOptionPane.showMessageDialog(null, result, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
