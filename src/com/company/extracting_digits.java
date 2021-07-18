//wap to count number of digits
package com.company;
import java.util.Scanner;

public class extracting_digits {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number to find the addition of the numbers.");
        int input = my_sc.nextInt();
        int i = input;
        int sum = 0;
        int digits = 0;
        while (i>0){
            digits++;
            sum = sum+i%10;
            i = i/10;
        }
        System.out.println(sum);
//        System.out.println(digits);
    }
}
