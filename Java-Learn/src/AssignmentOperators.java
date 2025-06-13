public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 5, j = 4;

        i += 2;
        System.out.println("i after += 2: " + i);
        j -= 1;
        System.out.println("j after -= 1: " + j);
        i *= 3;
        System.out.println("i after *= 3: " + i);
        j /= 3;
        System.out.println("j after /= 2: " + j);
        i %= 3;
        System.out.println("i after %= 3: " + i);
        String str = "Hello";
        str += " World";
        System.out.println("str after += \" World\": " + str);
    }
}
