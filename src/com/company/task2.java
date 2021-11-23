package com.company;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write all of  your throws: ");
        int throw1 = s.nextInt();
        int throw2 = s.nextInt();
        int throw3 = s.nextInt();

        int series=throw1+throw2+throw3;
        double avg = series/3;

        System.out.println("Series: "+ series + "      Avg: "+ avg);
    }
}