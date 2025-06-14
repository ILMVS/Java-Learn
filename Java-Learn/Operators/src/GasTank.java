import java.util.Scanner;

public class GasTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double litersInput = scanner.nextDouble();
        double tankCapacity = 70.0;
        if (litersInput >= 70) {
            System.out.println("The tank is full.");
        } else if (litersInput >= 60) {
            System.out.println("The tank is almost full.");
        } else if (litersInput >= 40) {
            System.out.println("The tank is 3/4 full.");
        } else if (litersInput >= 35) {
            System.out.println("The tank is half full.");
        } else if (litersInput >= 20) {
            System.out.println("The tank has enough fuel.");
        } else if (litersInput >= 1) {
            System.out.println("The tank does not have enough fuel.");
        } else {
            System.out.println("The tank is empty.");
        }
    }
}
