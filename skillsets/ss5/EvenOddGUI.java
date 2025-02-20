import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenOddGUI extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public EvenOddGUI() {
        setTitle("Even Or Odd");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Enter: ");
        inputField = new JTextField(10);
        JButton evaluateButton = new JButton("Evaluate");
        resultLabel = new JLabel("");

        evaluateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateAndEvaluate();
            }
        });

        add(promptLabel);
        add(inputField);
        add(evaluateButton);
        add(resultLabel);

        setVisible(true);
    }

    private void validateAndEvaluate() {
        try {
            int number = Integer.parseInt(inputField.getText());
            String result = number + (number % 2 == 0 ? " is an even number." : " is an odd number.");
            resultLabel.setText(result);
            resultLabel.setForeground(Color.RED);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Invalid integer. Please enter an integer.", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
