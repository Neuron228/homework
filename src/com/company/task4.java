package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the legs of the triangle:");
        int a = s.nextInt();
        int b = s.nextInt();
        double S = (a*b)*0.5;
        System.out.println("S: "+S);
    }
}
