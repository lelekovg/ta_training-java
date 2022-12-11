package com.epam.training.student_valentyna_leleko.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float summa = in.nextInt();
        int n = in.nextInt();
        float book = (int) ((summa / n) + (0.1 * (summa/n)));
        if (n <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else if (summa < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            System.out.println( + Math.round(book));
        }
    }
}
