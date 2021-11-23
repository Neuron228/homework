package com.company;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("When you started talking on the phone?: ");
        System.out.print("Hour: ");
        int hour = s.nextInt();
        System.out.print("Minutes: ");
        int min = s.nextInt();
        System.out.print("Seconds: ");
        int sec = s.nextInt();
        System.out.println("How long were you talking on the phone?: ");
        System.out.print("Hour: ");
        int hour1 = s.nextInt();
        System.out.print("Minutes: ");
        int min1 = s.nextInt();
        System.out.print("Seconds: ");
        int sec1 = s.nextInt();
        int hour2 = hour+hour1;
        int min2 = min+min1;
        int sec2 = sec+sec1;
        if(sec2 > 60){
            min2 = min2+ sec2/60;
            sec2=sec2%60;
        }
        if(min2 > 60){
            hour2 = hour2+ min2/60;
            min2=min2%60;
        }
        System.out.println("The time at which the conversation ended: ");
        System.out.println("Hour: "+ hour2);
        System.out.println("Minutes: "+ min2);
        System.out.println("Seconds: "+ sec2);
    }
}
