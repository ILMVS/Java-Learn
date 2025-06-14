import javax.swing.*;
import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {

        double sumAbove5 = 0;
        int countAbove5 = 0;

        double sumBelow4 = 0;
        int countBelow4 = 0;

        int countOnes = 0;

        double totalSum = 0;
        int totalCount = 0;

        for (int i = 1; i <= 20; i++) {
            String input = JOptionPane.showInputDialog("Enter grade #" + i + " (1 to 7):");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Input cancelled. Exiting.");
                return;
            }

            double grade;
            try {
                grade = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                i--;
                continue;
            }

            if (grade == 0) {
                JOptionPane.showMessageDialog(null, "Error: Grade 0 is invalid. Program will exit.");
                return;
            }

            if (grade < 1 || grade > 7) {
                JOptionPane.showMessageDialog(null, "Grade must be between 1 and 7.");
                i--;
                continue;
            }

            if (grade > 5) {
                sumAbove5 += grade;
                countAbove5++;
            }

            if (grade < 4) {
                sumBelow4 += grade;
                countBelow4++;
            }

            if (grade == 1) {
                countOnes++;
            }

            totalSum += grade;
            totalCount++;
        }

        StringBuilder result = new StringBuilder();

        result.append("Grade analysis:\n");

        if (countAbove5 > 0) {
            result.append("Average of grades > 5: ").append(sumAbove5 / countAbove5).append("\n");
        } else {
            result.append("No grades above 5.\n");
        }

        if (countBelow4 > 0) {
            result.append("Average of grades < 4: ").append(sumBelow4 / countBelow4).append("\n");
        } else {
            result.append("No grades below 4.\n");
        }

        result.append("Number of grades equal to 1: ").append(countOnes).append("\n");
        result.append("Overall average: ").append(totalSum / totalCount).append("\n");

        JOptionPane.showMessageDialog(null, result.toString());
    }
}
