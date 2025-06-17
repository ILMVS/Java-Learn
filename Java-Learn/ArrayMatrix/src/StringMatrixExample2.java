public class StringMatrixExample2 {
    public static void main(String[] args) {
        String[][] names = {{"Alice", "Bob"}, {"Charlie", "Diana"}, {"Eve", "Frank"}};

        for(String[] row : names) {
            for(String name : row) {
                System.out.print(name + " ");
            }
            System.out.println();
        }

    }
}
