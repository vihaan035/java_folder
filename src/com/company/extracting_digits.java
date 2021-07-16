//wap to count number of digits
package com.company;
import java.util.Scanner;

public class extracting_digits {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number to find how long it is.");
        int input = my_sc.nextInt();
        int i = input;
        int x = 0;
        int digits = 0;
        while (i>0){
            System.out.println(i);
            digits++;
            i = i/10;
            x = i+i;
        }
        System.out.println(x);
//        System.out.println(digits);
    }
}
