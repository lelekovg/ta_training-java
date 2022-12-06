package com.epam.training.student_valentyna_leleko.max;

import java.util.Arrays;

public class MaxMethod {
    public static int max(int[] values) {
        Arrays.sort(values);
        System.out.println("intArray after sorting: " + Arrays.toString(values));
        return values[values.length - 1];
    }

    public static void main(String[] args) {
        int[] intArray = {24, 340, 0, 34, 12, 10, 20};
        System.out.println("Maximum number = " + max(intArray));
    }

}
