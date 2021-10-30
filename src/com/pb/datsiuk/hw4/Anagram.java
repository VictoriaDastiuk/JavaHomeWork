package com.pb.datsiuk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = in.nextLine().toUpperCase();


        System.out.print("Enter second string: ");
        String s2 = in.nextLine().toUpperCase();

        Boolean result;
        result = isAnagram(s1,s2);
        System.out.println(result);
    }

    private static Boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }
}