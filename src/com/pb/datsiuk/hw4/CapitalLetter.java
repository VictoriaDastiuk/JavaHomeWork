package com.pb.datsiuk.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ведіть речення:");
        String string = reader.readLine();
        char[] simvoli = string.toCharArray();
        simvoli[0] = Character.toUpperCase(simvoli[0]);
        for (int i = 0; i < simvoli.length-1; i++) {
            if (Character.isWhitespace(simvoli[i])) {
                simvoli[i+1] = Character.toUpperCase(simvoli[i+1]);
            }
        }
        for (char x : simvoli) System.out.print(Character.toString(x));

    }
        }



