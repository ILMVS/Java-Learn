import java.util.Arrays;
import java.util.Collections;

public class InverseForArrayMutation {
    public static void main(String[] args) {
        String[] products = {
            "Laptop",
            "Tablet",
            "Smartphone",
            "Smartwatch",
            "Headphones",
            "Smart TV",
            "Camera"
        };

        int totalProducts = products.length;

        Arrays.sort(products);

//        setInverseMutateArray(products);

        Collections.reverse(Arrays.asList(products));

        for(int i = 0; i < totalProducts; i++) {
            System.out.println("Product " + (i + 1) +  " : " + products[i]);
        }
    }
    public static void setInverseMutateArray(String[] array) {
        int total = array.length;
        int total2 = array.length;
        System.out.println("For1: " );
        for(int i = 0; i < total2; i++) {
            String currentProduct = array[i];
            String inverseProduct = array[total - 1 - i];
            array[i] = inverseProduct;
            array[total - 1 - i] = currentProduct;
            total2--;
        }
    }
}
