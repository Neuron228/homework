package com.company;

import java.util.Scanner;

public class task5 {
        public static void main(String[] args) {
            int digit1, digit2, digit3;
            Scanner s = new Scanner(System.in);
            System.out.println("Type in number: ");
            int num1 = s.nextInt();

            digit1 = num1 % 10;
            digit2 = (num1 % 100) / 10;
            digit3 = (num1 - digit2 * 10 - digit1) / 100;

            String num2 = Integer.toString(digit1) + Integer.toString(digit2) + Integer.toString(digit3);

            System.out.println(digit1);
            System.out.println(digit2);
            System.out.println(digit3);

            System.out.println("Sum: " + (digit1 + digit2 + digit3));
            System.out.println("New number: " + num2);
        }
    }

