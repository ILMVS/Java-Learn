public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b; // Ternary operator to find the maximum of a and b
        System.out.println("The maximum value is: " + max);

        String result = (a < b) ? "a is less than b" : "a is not less than b"; // Ternary operator for comparison
        System.out.println(result);

        // Nested ternary operator example
        String message = (a == b) ? "a is equal to b" : (a > b) ? "a is greater than b" : "a is less than b";
        System.out.println(message);
    }
}
