public class PrimitiveIntegers {

    public static void main(String[] args) {
        //integers
        int x = 10; // this is a single line comment
        long bigNumber = 100000L; // 64-bit signed integer
        short shortNumber = 1000; // 16-bit signed integer
        byte smallNumber = 127; // 8-bit signed integer

        //type inference (Java 10+)
        var inferredInt = 42; // inferred as int
        var inferredLong = 1.2; // inferred as double
        var inferredString = "Hello, World!"; // inferred as String
        System.out.println("Inferred Int: " + inferredInt + " (" + ((Object) inferredInt).getClass().getSimpleName() + ")");
        System.out.println("Inferred String: " + inferredString + " (" + ((Object) inferredString).getClass().getSimpleName() + ")");


    }
}
