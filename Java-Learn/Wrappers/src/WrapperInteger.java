public class WrapperInteger {
    public static void main(String[] args) {
        int primitiveInt = 32767;
        // Create an Integer object using the Integer class
        Integer integerObject = Integer.valueOf(primitiveInt); // Autoboxing from int to Integer
        Integer integerObject2 = primitiveInt; // Autoboxing from int to Integer
        System.out.println("integerObject = " + integerObject);

        int num = integerObject;
        System.out.println("num = " + num);
        int num2 = integerObject2.intValue();
        System.out.println("num2 = " + num2);

        String str = "123";
        Integer value = Integer.valueOf(str);
        System.out.println("value = " + value);

        Short shortValue =  integerObject.shortValue();
        System.out.println("shortValue = " + shortValue);



    }
}
