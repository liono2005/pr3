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
    }
    }
