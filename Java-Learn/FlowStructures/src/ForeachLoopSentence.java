public class ForeachLoopSentence {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 14};

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        String names[] = {"Luis", "John", "Jane", "Doe"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
