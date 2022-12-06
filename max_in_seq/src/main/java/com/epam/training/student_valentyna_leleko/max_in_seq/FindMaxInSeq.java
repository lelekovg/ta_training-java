package com.epam.training.student_valentyna_leleko.max_in_seq;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max=num;
        while (true) {
            num = scanner.nextInt();
            if(num==0)break;
            if (num >= max ) {
                max = num;
            }
        }

        return max;
    }
    public static void main (String[]args){

        System.out.println("Test your code here!\n");

        FindMaxInSeq test = new FindMaxInSeq();

        System.out.println(max());
    }
}
