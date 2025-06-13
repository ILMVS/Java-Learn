public class StringExampleTestConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //StringBuilder is mutable

        long initialTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            c = c.concat(a).concat(b).concat("\n"); //Time taken for String concatenation: 4307 ms
//            c += a + b + "\n"; //Time taken for String concatenation: 1640 ms
//            c = String.join("", c, a, b, "\n"); //Time taken for String concatenation: 1849 ms
//            sb.append(a).append(b).append("\n"); //Time taken for String concatenation: 9 ms
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
        System.out.println("Time taken for String concatenation: " + (finalTime - initialTime) + " ms");


    }
}