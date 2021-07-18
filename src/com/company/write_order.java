//WAP to enter a number and print its each digit in right order
//For Example: 23894
//2
//3
//8
//9
//4
package com.company;
import java.util.Scanner;
import java.lang.Math;

public class write_order {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number and this program will arrange it in right to left order.");
        int input = my_sc.nextInt();
//        input = input%10;
//        System.out.println(input);
        int i = input;
        int digit = 0;
        while(i>0){
            i = i/10;
            digit++;
        }
//        System.out.println(digit);
        int j = input;
        while (j>0){
            int x = (int) (input/(Math.pow(10, digit-1)))%10;
//            any power of ten will result in number with those many 0s'
            System.out.println(x);
            digit--;
            j=j/10;
        }
//        System.out.println(i);
    }
}
