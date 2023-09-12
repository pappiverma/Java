package com.Methods;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        // System.out.println(" word of count in String :" +(str));
        CountWord cw = new CountWord();
        cw.countwords(str, count);

    }

    public int countwords(String str, int count) {

        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                count++;

            }
        }
        System.out.println(count);
        
        return count;
    }

}
