public class InstanceOfGenericTypesOperator {
    public static void main(String[] args) {
        Object str = "Hello, World!";
        Object num = 42;

        // Using instanceof to check the type of num
        if (str instanceof Integer) {
            System.out.println("str is an instance of Integer");
        } else {
            System.out.println("str is not an instance of Integer");
        }

        // Using instanceof to check the type of num
        if (num instanceof Long) {
            System.out.println("num is an instance of Long");
        } else {
            System.out.println("num is not an instance of Long");
        }
    }
}
