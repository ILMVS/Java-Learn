public class primitiveBooleans {
    public static void main(String[] args) {
        //primitive booleans
        boolean isTrue = true; // boolean value true
        boolean isFalse = false; // boolean value false

        // Example usage of boolean variables
        System.out.println("Is True: " + isTrue);
        System.out.println("Is False: " + isFalse);

        // Demonstrating boolean operations
        boolean andOperation = isTrue && isFalse; // logical AND
        boolean orOperation = isTrue || isFalse; // logical OR
        boolean notOperation = !isTrue; // logical NOT
        boolean xorOperation = isTrue ^ isFalse; // logical XOR
        boolean doubleNegation = !!isTrue; // double negation

        System.out.println("AND Operation: " + andOperation);
        System.out.println("OR Operation: " + orOperation);
        System.out.println("NOT Operation: " + notOperation);
        System.out.println("XOR Operation: " + xorOperation);
        System.out.println("Double Negation: " + doubleNegation);



    }
}
