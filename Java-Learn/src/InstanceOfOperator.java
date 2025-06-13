public class InstanceOfOperator {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Integer num = 42;

        // Using instanceof to check the type of str
        if (str instanceof String) {
            System.out.println("str is an instance of String");
        } else {
            System.out.println("str is not an instance of String");
        }

        // Using instanceof to check the type of num
        if (num instanceof Integer) {
            System.out.println("num is an instance of Integer");
        } else {
            System.out.println("num is not an instance of Integer");
        }

        // Using instanceof with a null reference
        if (str instanceof Object) {
            System.out.println("str is an instance of Object");
        } else {
            System.out.println("str is not an instance of Object");
        }

        if (num instanceof Number) {
            System.out.println("num is an instance of Number");
        } else {
            System.out.println("num is not an instance of Number");
        }
    }
}
