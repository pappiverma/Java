package com.Methods;

import java.util.Scanner;

public class Count_Word {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
       String   str = sc.nextLine();
        System.out.println(" The count of the String Word " + count_word(str));
        Count_Word r=new Count_Word();
            // r.count_word();

         

    }

    public static int count_word(String str) {
        int count = 0;
        if(str.substring(0,1)==" " ||  ((str.substring(str.length()-1)!=" "))) {

        

        
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {

                count++;
               System.out.println(count);

            }

        }
         count++;
    }
   count= count ++;

    
    return count;
}
       }