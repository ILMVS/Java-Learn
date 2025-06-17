public class ZigzagRearrangementArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] a = new int[10];

        int aux = 0;

        for(int i=0 ; i < numbers.length - i; i++) {
            a[aux++] = numbers[i];
            a[aux++] = numbers[numbers.length - 1- i];
        }

        System.out.println("Zigzag Rearrangement of Array: ");
        for(int i = 0; i < aux; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


