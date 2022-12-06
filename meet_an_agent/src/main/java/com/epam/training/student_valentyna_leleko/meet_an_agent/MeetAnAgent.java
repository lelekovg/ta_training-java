package com.epam.training.student_valentyna_leleko.meet_an_agent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        if (userInput == 133976) {
            System.out.println("Hello, Agent");
        } if (userInput != 133976) {
            System.out.println("Access denied");
        }
    }
}
