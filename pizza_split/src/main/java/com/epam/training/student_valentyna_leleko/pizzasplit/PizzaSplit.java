package com.epam.training.student_valentyna_leleko.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt(); //количество людей
        int n = scanner.nextInt(); //количество кусков
        int p = 1; //количество пицц
        int sum = n * p;
        while (l > 0) {
            n = sum;
            n *= p;
            if (n % l == 0) {
                break;
            }
            p++;
        }
        System.out.println(p);
    }
}
