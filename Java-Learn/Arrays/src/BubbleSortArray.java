import java.util.Arrays;
import java.util.Collections;

public class BubbleSortArray {
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

        bubbleSort(products);
        System.out.println("Sorted products: " + Arrays.toString(products));

        Integer [] numbers = {5, 3, 8, 6, 2, 7, 4, 1};
        bubbleSort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

    }

    public static void setInverseMutateArray(String[] array) {
        int total = array.length;
        int total2 = array.length;
        System.out.println("For1: ");
        for (int i = 0; i < total2; i++) {
            String currentProduct = array[i];
            String inverseProduct = array[total - 1 - i];
            array[i] = inverseProduct;
            array[total - 1 - i] = currentProduct;
            total2--;
        }
    }

    public static  Object bubbleSort(Object[] array) {
        int total = array.length;
        int count = 0;

        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) array[j + 1]).compareTo(array[j]) < 0) {
                    Object aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    count++;
                }
            }
        }
        System.out.println("count: " + count);
        return array;
    }
}
