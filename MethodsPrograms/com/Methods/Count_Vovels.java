package com.Methods;

import java.util.Scanner;

public class Count_Vovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println(" Input String name");
        String str = sc.nextLine();

        System.out.println("the count of vowels " + count_vowel(str));

    }

    public static int count_vowel(String str) {

        int count = 0;
        int lenght;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'i') {
                count++;
            }

        }
        return count;

    }

}
