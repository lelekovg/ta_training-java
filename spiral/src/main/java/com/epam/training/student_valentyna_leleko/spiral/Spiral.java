package com.epam.training.student_valentyna_leleko.spiral;

class Spiral {
    static int[][] spiral(int y, int x) {
        int[][] spiral = new int[y][x];
        int value = 1;
        int minx = 0;
        int maxx = x - 1;
        int miny = 0;
        int maxy = y - 1;
        while (value <= y * x) {
            for (int i = minx; i <= maxx; i++) {
                spiral[miny][i] = value;
                value++;
            }
            for (int i = miny + 1; i <= maxy; i++) {
                spiral[i][maxx] = value;
                value++;
            }
            for (int i = maxx - 1; i >= minx && value <= y * x; i--) {
                spiral[maxy][i] = value;
                value++;
            }
            for (int i = maxy - 1; i >= miny + 1; i--) {
                spiral[i][minx] = value;
                value++;
            }
            minx++;
            miny++;
            maxx--;
            maxy--;
        }
        return spiral;
    }

    public static void main(String[] args) {
        {
            int[][] spiral = Spiral.spiral(5, 8);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
    }

}
