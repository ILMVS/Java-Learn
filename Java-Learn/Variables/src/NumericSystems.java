import javax.swing.*;

public class NumericSystems {
    public static void main(String[] args) {
        int decimal = 10; // Decimal (base 10)
        int binary = 0b1010; // Binary (base 2)
        int octal = 012; // Octal (base 8, note the leading zero)
        int hexadecimal = 0xA; // Hexadecimal (base 16)
        int largeHexadecimal = 0x1A2B3C4D; // Large Hexadecimal (base 16)

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Large Hexadecimal: " + largeHexadecimal);

        //using reference Integer we can convert between numeric systems .toBinaryString(), .toOctalString(), .toHexString()
        if (10 == 0b1010 && 10 == 012 && 10 == 0xA) {
            System.out.println("All numeric systems represent the same value: " + decimal);
        } else {
            System.out.println("Numeric systems represent different values.");
        }

        String numberStr = JOptionPane.showInputDialog(null, "Enter a number in decimal format:");
        try {
            int number = Integer.parseInt(numberStr);
            String binaryStr = Integer.toBinaryString(number);
            String octalStr = Integer.toOctalString(number);
            String hexStr = Integer.toHexString(number).toUpperCase();

            JOptionPane.showMessageDialog(null, "Decimal: " + number +
                    "\nBinary: " + binaryStr +
                    "\nOctal: " + octalStr +
                    "\nHexadecimal: " + hexStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid decimal number.");
        }
    }
}
