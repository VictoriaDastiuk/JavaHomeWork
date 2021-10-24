package com.pb.datsiuk.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);
        String sing = "-"; // "+"; //
        Scanner scan = new Scanner(System.in);
                        int z =0;
                do {
            z++;
            System.out.println("Введите число від 0 до 100: ");
            int y = scan.nextInt();
            if (y < x) {
                System.out.println("Загадане число більше. Спробуй ще раз");
            } else if (y > x) {
                System.out.println("Загадане число менше. Спробуй ще раз");
            } else if (y == x) {
                System.out.println("Вітаю ти вгадав число " + x + " за " + z + " спроб");
               break;
            }

            System.out.println("спробуєш ще раз? Хочеш продовжити введи +, хочеш завершити введи -");
                    sing= scan.next();
                    switch (sing) {
                        case "-":
                            System.out.println("Бувай");
                            System.exit(0);
                        case "+":
                            System.out.println("Урааа! Продовжуємо)");
                    };
                }
                while (true);
    }
}

