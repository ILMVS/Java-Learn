import java.util.Arrays;

public class ForArray {
    public static void main(String[] args) {
        String[] products = new String[7];
        int totalProducts = products.length;

        products[0] = "Laptop";
        products[1] = "Tablet";
        products[2] = "Smartphone";
        products[3] = "Smartwatch";
        products[4] = "Headphones";
        products[5] = "Smart TV";
        products[6] = "Camera";

        System.out.println("For: " );
        for(int i = 0; i < totalProducts; i++) {
            System.out.println("Product " + (i + 1) +  " : " + products[i]);
        }

        System.out.println("Foreach: " );
        for(String product : products) {
            System.out.println("Product: " + product);
        }

        System.out.println("While: " );
        int i = 0;
        while(i < totalProducts) {
            System.out.println("Product " + (i + 1) +  " : " + products[i]);
            i++;
        }

        System.out.println("Do-While: " );
        int j = 0;
        do {
            System.out.println("Product " + (j + 1) +  " : " + products[j]);
            j++;
        } while(j < totalProducts);

        int[] numbers = new int[10];
        for(int k = 0; k < numbers.length; k++) {
            numbers[k] = k * 10;
        }
    }
}
