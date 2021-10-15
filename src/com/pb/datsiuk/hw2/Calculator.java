package com.pb.datsiuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int result;
        String sing = "-"; // "+"; //
        System.out.println("Введіть число х =");
        x = scan.nextInt();
        System.out.println("Введіть число у =");
        y = scan.nextInt();
        System.out.println("Введіть знак:");
        sing = scan.next();
        switch (sing) {
            case "+":
                result = x + y;
                System.out.println("Результат =" + result);
                break;
            case "-":
                result = x - y;
                System.out.println("Результат =" + result);
                break;
            case "*":
                result = x * y;
                System.out.println("Результат =" + result);
                break;
            case "/":
                if (y == 0) {
                    System.out.println ("На нуль ділити не можна!");
                } else {
                result = x / y;
                System.out.println("Результат =" + result);}
                break;
            default:  System.out.println("Повтори ще раз");
        }
    }
}
