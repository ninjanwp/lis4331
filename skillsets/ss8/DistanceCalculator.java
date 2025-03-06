import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DistanceCalculator extends JFrame {
    private JTextField legAField, legBField, legCField;
    private JButton computeButton;

    public DistanceCalculator() {
        super("Distance Calculator");
        setLayout(new FlowLayout());

        add(new JLabel("Leg A:"));
        legAField = new JTextField(10);
        add(legAField);

        add(new JLabel("Leg B:"));
        legBField = new JTextField(10);
        add(legBField);

        add(new JLabel("Leg C:"));
        legCField = new JTextField(10);
        legCField.setEditable(false);
        add(legCField);

        computeButton = new JButton("Compute");
        computeButton.addActionListener(new ComputeListener());
        add(computeButton);
    }

    private class ComputeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double legA = Double.parseDouble(legAField.getText());
                double legB = Double.parseDouble(legBField.getText());
                double legC = Math.sqrt((legA * legA) + (legB * legB));
                legCField.setText(String.format("%.2f", legC));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers for Leg A and Leg B.");
            }
        }
    }

    public static void main(String[] args) {
        DistanceCalculator frame = new DistanceCalculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
