public class OddsAndEvensArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] odds = new int[numbers.length];
        int[] evens = new int[numbers.length];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evens[evenIndex++] = number;
            } else {
                odds[oddIndex++] = number;
            }
        }

        System.out.println("Odd Numbers: ");
        for (int odd : odds) {
            System.out.print(odd + " ");
        }

        System.out.println("\nEven Numbers: ");
        for (int even : evens) {
            System.out.print(even + " ");
        }
    }
}
