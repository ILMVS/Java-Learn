public class InverseForArray {
    public static void main(String[] args) {
//        products[0] = "Laptop";
//        products[1] = "Tablet";
//        products[2] = "Smartphone";
//        products[3] = "Smartwatch";
//        products[4] = "Headphones";
//        products[5] = "Smart TV";
//        products[6] = "Camera";

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

        System.out.println("For1: " );
        for(int i = 0; i < totalProducts; i++) {
            System.out.println("Product " + (i + 1) +  " : " + products[totalProducts-1-i]);
        }

        System.out.println("For2: " );
        for(int i = totalProducts - 1; i >= 0; i--) {
            System.out.println("Product " + (i + 1) +  " : " + products[i]);
        }

        System.out.println("For3: " );
        for(int i = 0; i < totalProducts; i++) {
            System.out.println("Product " + (i + 1) +  " : " + products[i]);
        }



    }
}
