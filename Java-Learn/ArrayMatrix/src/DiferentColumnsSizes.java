public class DiferentColumnsSizes {
    public static void main(String[] args) {
        // Create a 2D array with different column sizes
        String[][] names = new String[3][];

        names[0] = new String[]{"Alice", "Bob"};
        names[1] = new String[]{"Charlie", "Diana", "Eve"};
        names[2] = new String[]{"Frank"};

        // Print the 2D array
        for(String[] row : names) {
            for(String name : row) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
