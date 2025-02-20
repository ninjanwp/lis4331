import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PaintCalculatorGUI extends JFrame {
    private JTextField priceField, lengthField, widthField, heightField;
    private JLabel resultLabel;

    public PaintCalculatorGUI() {
        setTitle("Paint Cost Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        JLabel priceLabel = new JLabel("Paint price per gallon:");
        JLabel lengthLabel = new JLabel("Room/house length:");
        JLabel widthLabel = new JLabel("Room/house width:");
        JLabel heightLabel = new JLabel("Room/house height:");

        priceField = new JTextField(10);
        lengthField = new JTextField(10);
        widthField = new JTextField(10);
        heightField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAndCalculate();
            }
        });

        add(priceLabel);
        add(priceField);
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(heightLabel);
        add(heightField);
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    private void validateAndCalculate() {
        try {
            double pricePerGallon = Double.parseDouble(priceField.getText());
            double length = Double.parseDouble(lengthField.getText());
            double width = Double.parseDouble(widthField.getText());
            double height = Double.parseDouble(heightField.getText());

            if (pricePerGallon <= 0 || length <= 0 || width <= 0 || height <= 0) {
                JOptionPane.showMessageDialog(this, "All values must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double area = (length * height * 2) + (width * height * 2);
            double gallonsRequired = area / Methods.COVERAGE_PER_GALLON;
            double totalCost = gallonsRequired * pricePerGallon;

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

            String result = "<html>Paint = " + currencyFormat.format(pricePerGallon) + " per gallon.<br>" +
                            "Area of room/house = " + decimalFormat.format(area) + " sq ft.<br>" +
                            "Total = " + currencyFormat.format(totalCost) + "</html>";

            resultLabel.setText(result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
