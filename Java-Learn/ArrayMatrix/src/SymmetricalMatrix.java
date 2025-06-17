public class SymmetricalMatrix {
    public static void main(String[] args) {

        //Matrix is symmetrical if it is equal coz the number of rows and columns are equal

        int[][] matrix = {
            {1, 2, 3,4},
            {2, 4, 5,6},
            {3, 5, 6,7},
            {4, 6, 7,8}
        };

        if (isSymmetrical(matrix)) {
            System.out.println("The matrix is symmetrical.");
        } else {
            System.out.println("The matrix is not symmetrical.");
        }
    }
    public static boolean isSymmetrical(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
