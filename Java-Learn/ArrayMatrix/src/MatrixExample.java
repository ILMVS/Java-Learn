public class MatrixExample {
    public static void main(String[] args) {
        int[][] matrix = new int[2][4];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 11;
        matrix[1][1] = 12;
        matrix[1][2] = 13;
        matrix[1][3] = 14;



        System.out.println("rows # = " + matrix.length);
        System.out.println("columns # = " + matrix[0].length);

        //first number in the matrix
        System.out.println("first number = " + matrix[0][0]);

        //last number in the matrix
        int lastRow = matrix.length - 1;
        int lastColumn = matrix[0].length - 1;
        System.out.println("last number = " + matrix[lastRow][lastColumn]);



    }
}
