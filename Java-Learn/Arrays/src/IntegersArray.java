import java.util.Arrays;

public class IntegersArray {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 40;
        numbers[3] = 10;
        Arrays.sort(numbers);

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[3];

        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + i);
        System.out.println("Second element: " + j);
        System.out.println("Third element: " + k);
        System.out.println("Fourth element: " + l);

        //string array

        String[] products = new String[7];

        products[0] = "Laptop";
        products[1] = "Tablet";
        products[2] = "Smartphone";
        products[3] = "Smartwatch";
        products[4] = "Headphones";
        products[5] = "Smart TV";
        products[6] = "Camera";
        Arrays.sort(products);
        System.out.println("product[0] = " + products[0]);
        System.out.println("product[1] = " + products[1]);
        System.out.println("product[2] = " + products[2]);
        System.out.println("product[3] = " + products[3]);
        System.out.println("product[4] = " + products[4]);
        System.out.println("product[5] = " + products[5]);
        System.out.println("product[6] = " + products[6]);





    }
}
