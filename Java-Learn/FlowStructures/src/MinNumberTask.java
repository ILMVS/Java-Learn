import java.util.Scanner;

public class MinNumberTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity to compare (min 10);");
        int count = scanner.nextInt();
        if (count < 10) {
            System.out.println("You must enter at least 10 numbers.");
            return;
        }
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("The minimum number is: " + minNumber);
        if (minNumber < 10) {
            System.out.println("The minimum number is less than 10!");
        } else {
            System.out.println("The minimum number is greater than or equal to 10!");
        }
    }
}
