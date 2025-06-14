public class LogicOperators {
    public static void main(String[] args) {
        int i = 10, j = 20;
        boolean m = false;

        // Logical AND
        boolean andResult = (i < j) && (j > 15);
        System.out.println("Logical AND (i < j && j > 15): " + andResult);
        // Logical OR
        boolean orResult = (i > j) || (j > 15);
        System.out.println("Logical OR (i > j || j > 15): " + orResult);
        // Logical NOT
        boolean notResult = !(i < j);
        System.out.println("Logical NOT (!(i < j)): " + notResult);
        // Logical XOR
        boolean xorResult = (i < j) ^ (j > 15);
        System.out.println("Logical XOR (i < j ^ j > 15): " + xorResult);

        // Short-circuit evaluation
        boolean shortCircuitAnd = (i < j) && (m = true);
        System.out.println("Short-circuit AND (i < j && m = true): " + shortCircuitAnd);
        System.out.println("Value of m after short-circuit AND: " + m);
        boolean shortCircuitOr = (i > j) || (m = false);
        System.out.println("Short-circuit OR (i > j || m = false): " + shortCircuitOr);
        System.out.println("Value of m after short-circuit OR: " + m);

        //&& has higher precedence than ||
        //presedence is from left to right
        // Example of precedence
        boolean precedenceResult = (i < j) && (j > 15) || (m = true);
        System.out.println("Result of precedence (i < j && j > 15 || m = true): " + precedenceResult);
        System.out.println("Value of m after precedence operation: " + m);

        // Example of precedence with NOT
        boolean precedenceNotResult = !(i < j) || (j > 15);
        System.out.println("Result of precedence with NOT (!(i < j) || (j > 15)): " + precedenceNotResult);

        // Example of precedence with multiple operators
        boolean complexPrecedenceResult = (i < j && j > 15) || (m = true) ^ (i > 5);
        System.out.println("Result of complex precedence ((i < j && j > 15) || (m = true) ^ (i > 5)): " + complexPrecedenceResult);
        System.out.println("Value of m after complex precedence: " + m);


    }

    public static class UnaryOperators {
        public static void main(String[] args) {
            int i = -5;
            int j = +i;
            System.out.println("j = " + j);

            int k = -i;
            System.out.println("k = " + k);

            i=6 ;
            j=+i;
            System.out.println("j = " + j);
            k = -i;
            System.out.println("k = " + k);

        }
    }
}
