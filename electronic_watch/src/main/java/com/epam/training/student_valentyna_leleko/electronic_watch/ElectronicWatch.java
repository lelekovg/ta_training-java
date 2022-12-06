package com.epam.training.student_valentyna_leleko.electronic_watch;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int sec = seconds % 60;
        int min = seconds / 60;
        int hour = seconds / 3600;
        int dif = (seconds - (hour * 3600)) / 60;
        String strSec = ((sec < 10) ? "0" + sec : Integer.toString(sec));
        String strMin = ((min < 10) ? ("0" + min) : (((dif == 0) || (dif == 1)) ? ("0" + dif) : Integer.toString(dif)));

        String strHour = ((hour < 10) ? "" + hour : (hour == 24) ? "0" : Integer.toString(hour));

        System.out.println(strHour + ":" + strMin + ":" + strSec);

    }
}
