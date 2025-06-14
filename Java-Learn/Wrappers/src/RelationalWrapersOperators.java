public class RelationalWrapersOperators {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("num1 == num2: " + (num1 == num2)); // true, because both refer to the same object


        System.out.println("num1 == num2: " + (num1 == num2));

        System.out.println("num1.equals(num2): " + num1.equals(num2));

        //Autoboxing
        Integer num3 = 1001;
        boolean condition = num1 > num2;
        System.out.println("num1 > num2: " + condition);
        boolean condition2 = num1 < num3;
        System.out.println("num1 < num3: " + condition2);
    }
}
