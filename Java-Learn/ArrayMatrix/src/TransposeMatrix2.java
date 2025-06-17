public class TransposeMatrix2 {
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3,4,5, 6, 7,8},
            {9, 10, 11, 12,13,14, 15, 16},
            {17, 18, 19, 20,21,22,23,24},
            {25, 26, 27, 28,29,30,31,32},
        };

         int [][] matrix2 = new int[8][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        } 


    }
}
