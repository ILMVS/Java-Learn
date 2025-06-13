public class TypeConvertion {
    public static void main(String[] args) {
        // Type conversion examples
        int intValue = 42; // integer value
        double doubleValue = intValue; // implicit conversion from int to double
        System.out.println("Implicit Conversion (int to double): " + doubleValue);

        double anotherDoubleValue = 3.14;
        int anotherIntValue = (int) anotherDoubleValue; // explicit conversion from double to int
        System.out.println("Explicit Conversion (double to int): " + anotherIntValue);

        String stringValue = "123";
        int stringToInt = Integer.parseInt(stringValue); // converting String to int
        System.out.println("String to Int: " + stringToInt);

        String doubleStringValue = "3.14";
        double stringToDouble = Double.parseDouble(doubleStringValue); // converting String to double
        System.out.println("String to Double: " + stringToDouble);

        String intToString = Integer.toString(intValue);
        String intToString2 = String.valueOf(intValue);
        String intToString3 =  ""+intValue; // converting int to String using concatenation

        System.out.println("intToString1 = " + intToString3);
        System.out.println("intToString2 = " + intToString3);
        System.out.println("intToString3 = " + intToString3);

    }
}
