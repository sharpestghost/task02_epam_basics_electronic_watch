package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {

    public final static int MINUTES_IN_A_HOUR = 60;
    final static int SECONDS_IN_A_MINUTE = 60;
    protected final static int HOURS_IN_A_DAY = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int outputHours = time / (MINUTES_IN_A_HOUR * SECONDS_IN_A_MINUTE) % HOURS_IN_A_DAY;
        int outputMinutes = time / SECONDS_IN_A_MINUTE % MINUTES_IN_A_HOUR;
        int outputSeconds = time % SECONDS_IN_A_MINUTE;
        String result = String.format("%d:%2d:%2d", outputHours, outputMinutes, outputSeconds).replace(' ', '0');
        System.out.println(result);
    }
}
