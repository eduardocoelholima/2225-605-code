package rit;


public class MatrixMultiply {
    private static int[][] matrix1 = new int[][] {{1,1},{2,2}};
    private static int[][] matrix2 = new int[][] {{2,2},{1,1}};
    private static int[][] result = new int[matrix1.length][matrix2[0].length];

    public static void main(String[] args) {
        for (int row = 0; row < matrix1.length; row++)
            for (int col = 0; col < matrix2[0].length; col++)
                for (int inner = 0; inner < matrix1[0].length; inner++)
                    result[row][col] += matrix1[row][inner] * matrix2[inner][col];

        for (int row=0; row<result.length; row++) {
            for (int col = 0; col < result[0].length; col++)
                System.out.print(result[row][col] + " ");
            System.out.println();
        }
    }
}
