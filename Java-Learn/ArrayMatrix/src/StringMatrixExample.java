public class StringMatrixExample {
    public static void main(String[] args) {
        String[][] names = new String[3][2];

        names[0][0] = "Alice";
        names[0][1] = "Bob";

        names[1][0] = "Charlie";
        names[1][1] = "Diana";

        names[2][0] = "Eve";
        names[2][1] = "Frank";

        for(int i=0 ;i < names.length; i++) {
            for(int j=0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

    }
}
