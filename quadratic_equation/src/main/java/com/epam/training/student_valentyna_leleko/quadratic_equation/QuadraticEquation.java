package com.epam.training.student_valentyna_leleko.quadratic_equation;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d;
        d =  b * b - 4 * a * c;
        double x, x1, x2;
        if(d > 0) {
            x1=(-b - Math.sqrt(d))/(2*a);
            x2=(-b + Math.sqrt(d))/(2*a);
            System.out.println(x1 + " " +x2);
        } else if (d == 0) {
            x = - (b / (2 * a));
            System.out.println(x);
        } else {
            System.out.println("no roots");
        }
    }
}