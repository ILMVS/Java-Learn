public class IfElseSentence {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // If-else statement to compare two numbers
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        // Nested if-else statement
        if (a > 0) {
            if (b > 0) {
                System.out.println("Both a and b are positive");
            } else {
                System.out.println("a is positive, but b is not");
            }
        } else {
            System.out.println("a is not positive");
        }

        if (a > 0)
            System.out.println("a is positive");
        else
            System.out.println("a is not positive");

        System.out.println("Leap Year Check:" + getLeapYear(2020));
        System.out.println("Leap Year Check:" + getLeapYear(2021));

    }

    public static boolean getLeapYear(Integer year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
