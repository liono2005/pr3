package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Условные выражения
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        if (A > -137 && A < -57 || A > 123 && A < 55) {
            System.out.println("Принадлежит интервалу.");
        } else System.out.println("Не принадлежит интервалу.");
       //pflfybt 3.2
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if ((A % 2 == 0 || B % 2 == 0) && (A % 3 == 0 && B % 3 == 0 && C % 3 == 0)) {
            System.out.println("Истина");
        } else System.out.println("Ложь");
    }
    }

