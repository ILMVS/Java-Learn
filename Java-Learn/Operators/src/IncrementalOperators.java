public class IncrementalOperators {
    public static void main(String[] args) {
        int i = 5, j = 10;

        i++;
        System.out.println("After incrementing, a = " + i);

        j--;
        System.out.println("After decrementing, b = " + j);

        int c = i + j++;
        System.out.println("c = " + c);

        int d = --i + j;
        System.out.println("d = " + d);

        i++;
        System.out.println("Post-increment i: " + i);
        j--;
        System.out.println("Post-decrement j: " + j);

        int preIncrement = ++i;
        System.out.println("Pre-increment i: " + preIncrement);
        int preDecrement = --j;
        System.out.println("Pre-decrement j: " + preDecrement);
    }
}
