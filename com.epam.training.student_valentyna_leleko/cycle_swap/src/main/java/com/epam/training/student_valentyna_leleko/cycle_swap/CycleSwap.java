package com.epam.training.student_valentyna_leleko.cycle_swap;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int[] arr = new int[array.length];
        if (array.length != 0) {
            System.arraycopy(array, 0, arr, 1, array.length - 1);
            System.arraycopy(array, arr.length - 1, arr, 0, 1);
            System.arraycopy(arr, 0, array, 0, array.length);
            System.out.println(Arrays.toString(array));
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int[] arr = new int[array.length];
        if (array.length != 0) {
            System.arraycopy(array, 0, arr, shift, array.length - shift);
            System.arraycopy(array, arr.length - shift, arr, 0, shift);
            System.arraycopy(arr, 0, array, 0, array.length);
            System.out.println(Arrays.toString(array));
        }
    }
}
