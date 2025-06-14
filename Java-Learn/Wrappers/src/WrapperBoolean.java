public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objBoolean = Boolean.valueOf(false);  // Autoboxing from boolean to Boolean
        boolean primBoolean2 = objBoolean.booleanValue(); // Unboxing from Boolean to boolean

    }
}
