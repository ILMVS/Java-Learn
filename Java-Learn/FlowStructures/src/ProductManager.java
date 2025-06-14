import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ProductManager {

    public static void main(String[] args) {
        int optionIndex = 0; // Declare once
        Object selectedOption; // Declare once

        Map<String, Integer> options = new HashMap<>();
        options.put("Update", 1);
        options.put("Delete", 2);
        options.put("Add", 3);
        options.put("List", 4);
        options.put("Exit", 5);

        Object[] optionArray = options.keySet().toArray();

        do {
            selectedOption = JOptionPane.showInputDialog(null,
                    "Select an Option",
                    "Product Manager",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    optionArray,
                    optionArray[0]);

            if (selectedOption == null) {
                JOptionPane.showMessageDialog(null, "You must select an operation");
                continue;
            }

            optionIndex = options.get(selectedOption.toString());

            switch (optionIndex) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Product updated successfully");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Product deleted successfully");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Product added successfully");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Product list displayed successfully");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Exited successfully!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Unknown option");
            }

        } while (optionIndex != 5);
    }
}