package com.pb.datsiuk.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Введи число а [" + i + "]=");
            a[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(a));

        int sum = 0;
        int positive = 0;
        int negative = 0;
        boolean Sorted = false;
        int z;
        for (i = 0; i < 10; i++) {
            sum = sum + a[i];
            if (a[i] > 0) {
                positive = positive + 1;
            } else {
                if (a[i] < 0) {
                    negative = negative + 1;
                } else {
                    System.out.println("Елемент а[" + i + "] не є ні позитивним ні негативним числом");
                }
            }
                    }
        while(!Sorted) {
            Sorted = true;
            for (i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    Sorted = false;
                    z = a[i];
                    a[i] = a[i+1];
                    a[i+1] = z;
    }}}
        System.out.println("Сума масиву =" + sum);
        System.out.println("Негативних чисел =" + negative);
        System.out.println("Позитивних чисел =" + positive);
        System.out.println(Arrays.toString(a));
    }
}
