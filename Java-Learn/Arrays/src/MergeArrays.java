public class MergeArrays {
    public static void main(String[] args) {
        int [] a, b,c,d;
         a = new int[10];
         b = new int[10];
         c = new int[20];
         d = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) *5;
        }
        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        System.out.println("Merged Array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        aux = 0;
        for(int i = 0; i < c.length - i ; i+=2) {
            c[aux++] = a[i];
            c[aux++] = a[i+1];
            c[aux++] = b[i];
            c[aux++] = b[i+1];
        }

        System.out.println("Second Merged Array: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }


    }
}
