public class ArithmeticOperator {
    public static void main(String[] args) {
        int i = 5, j = 4, addition = i + j;
        System.out.println("Addition: " + addition);
        System.out.println("i+j: " + (i + j));

        int subtraction = i - j;
        System.out.println("Subtraction: " + subtraction);

        int multiplication = i * j;
        System.out.println("Multiplication: " + multiplication);

        double division = (double) i / j;
        System.out.println("Division: " + division);

        int modulo = i % j;
        System.out.println("Modulo: " + modulo);

        //presence table
        // * > / > % > + > -


    }
}