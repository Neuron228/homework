package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the price?: ");
        double sp = s.nextInt();
        System.out.println("How many kilograms?: ");
        int sk = s.nextInt();
        System.out.println("How many kilograms you want?: ");
        int bk = s.nextInt();
        double bp = sp*1.15;

        System.out.println("Final price: " + bk*bp);
        System.out.println("Kgs left: " + (sk-bk));
    }
}
