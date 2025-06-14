import java.util.Scanner;

public class Multiply2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();

        int result = 0;
        int absNum2 = (num2 < 0) ? (int)-num2 : (int)num2; // Convert to absolute for multiplication
        for (int i = 0; i < absNum2; i++) {
            result += num1;
        }
        if (num2 < 0) {
            result = -result;
        }
        System.out.println("Result: " + result);
    }
}
