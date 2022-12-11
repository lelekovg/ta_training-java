package com.epam.training.student_valentyna_leleko.average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int   number = input.nextInt();
        while (number != 0) {
            sum +=number;
            count++;
            number = input.nextInt();
            if (number == 0) break;
        }
        double averege = sum /( count--);
        int result = (int) Math.round(averege);
        System.out.println((result));
    }
}