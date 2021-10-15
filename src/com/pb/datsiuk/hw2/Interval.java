package com.pb.datsiuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введіть число х =");
        x = scan.nextInt();
        if (x >=0 & x<=14) {
            System.out.println("Число входить в проміжок від 0 до 14");}
        else {
            if (x >=15 & x<=35) {
                System.out.println("Число входить в проміжок від 15 до 35");}
            else {
                if (x >=36 & x<=50) {
                    System.out.println("Число входить в проміжок від 36 до 50");}
                else {
                    if (x >=51 & x<=100) {
                        System.out.println("Число входить в проміжок від 51 до 100");}
                    else {
                        System.out.println("Число , більше 100");}
                    }}}}
                            }

