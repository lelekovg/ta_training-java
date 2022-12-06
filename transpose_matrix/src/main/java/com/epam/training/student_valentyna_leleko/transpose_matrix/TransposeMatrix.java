package com.epam.training.student_valentyna_leleko.transpose_matrix;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return matrix;
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] array_new = new int[height][width];
        int x = 0;
        while (x < width) {
            for (int y = 0; y < height; y++) {
                array_new[y][x] = matrix[x][y];
            }
            x++;
        }
        return array_new;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        System.out.println("The matrix is: ");
        int[][] a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int[] ints : a) {
            System.out.print("[");
            for (int y = 0; y < a[0].length; y++) {
                System.out.print(ints[y] + ",");
            }
            System.out.print("]\n");
        }
        a = transpose(a); // call
        System.out.println();
        for (int[] ints : a) {
            System.out.print("[");
            for (int y = 0; y < a[0].length; y++) {
                System.out.print(ints[y] + ",");
            }
            System.out.print("]\n");
        }
    }
}
