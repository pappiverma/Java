package com.Arrays;

import java.util.Scanner;

public class Arr_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloum = sc.nextInt();
        int[][] num = new int[row][coloum];
        // input
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < coloum; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < coloum; j++) {

                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
