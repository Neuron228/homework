package com.company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many nails do you have: ");
        int nails = s.nextInt();
        int box = nails/50;
        int rem= nails-(box*50);
        System.out.println(box + " full boxes");
        System.out.println(rem + " nails will remain");
    }
}


