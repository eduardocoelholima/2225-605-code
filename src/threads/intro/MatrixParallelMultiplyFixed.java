package threads.intro;

import java.util.*;
import static java.lang.Thread.sleep;

public class MatrixParallelMultiplyFixed extends Thread {
    private static int[][] matrix1 = new int[][] {{1,1},{2,2}};
    private static int[][] matrix2 = new int[][] {{2,2},{1,1}};
    private static int[][] result = new int[matrix1.length][matrix2[0].length];
    private int row, col;

    MatrixParallelMultiplyFixed(int row, int col) { this.row = row; this.col = col; }

    public void run() {
        try { sleep(1); } catch (Exception e) {}
        for (int inner = 0; inner < matrix1[0].length; inner++)
            result[row][col] += matrix1[row][inner] * matrix2[inner][col];
    }

    public static void main(String[] args) {
        LinkedList<Thread> threads = new LinkedList<>();
        for (int row = 0; row < matrix1.length; row++)
            for (int col = 0; col < matrix2[0].length; col++) {
                MatrixParallelMultiplyFixed task = new MatrixParallelMultiplyFixed(row, col);
                threads.add(task);
                threads.peekLast().start();
            }
        for (Thread thread:threads) try { thread.join(); } catch (InterruptedException e) {}

        for (int row=0; row<result.length; row++) {
            for (int col = 0; col < result[0].length; col++)
                System.out.print(result[row][col] + " ");
            System.out.println();
        }
    }
}
