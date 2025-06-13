import javax.swing.*;

public class LongestName {
    public static void main(String[] args) {
        String person1 = JOptionPane.showInputDialog("Enter first person full name:");
        String person2 = JOptionPane.showInputDialog("Enter second person full name:");
        String person3 = JOptionPane.showInputDialog("Enter third person full name:");

        String name1 = person1.split(" ")[0];
        String name2 = person2.split(" ")[0];
        String name3 = person3.split(" ")[0];
        String result;

        if (name1.length() >= name2.length() && name1.length() >= name3.length()) {
            result = person1;
        } else if (name2.length() >= name1.length() && name2.length() >= name3.length()) {
            result = person2;
        } else {
            result = person3;
        }

        JOptionPane.showMessageDialog(null, result + " has the longest name.");
    }
}
