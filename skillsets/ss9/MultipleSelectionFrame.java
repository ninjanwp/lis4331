import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelectionFrame extends JFrame {
    private JList<String> leftList;
    private JList<String> rightList;
    private JButton copyButton;
    private DefaultListModel<String> rightListModel;

    private static final String[] items = {
        "Mushroom", "Onion and Cheese", "Red Pepper and Bacon", "Italian",
        "Lip Smacker", "Hawaiian", "BBQ Chicken", "Margherita", "Veggie Lovers", "Meat Feast"
    };

    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        // Left List (Multiple Selection)
        leftList = new JList<>(items);
        leftList.setVisibleRowCount(5);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        // Button
        copyButton = new JButton("Copy >>>");
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyItems();
            }
        });
        add(copyButton);

        // Right List (Single Selection)
        rightListModel = new DefaultListModel<>();
        rightList = new JList<>(rightListModel);
        rightList.setVisibleRowCount(5);
        rightList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));
    }

    private void copyItems() {
        for (String item : leftList.getSelectedValuesList()) {
            if (!rightListModel.contains(item)) {
                rightListModel.addElement(item);
            }
        }
    }
}
