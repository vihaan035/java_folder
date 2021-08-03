package com.company;
import java.util.Scanner;
public class test_java {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("WAP to enter ten numbers and count how many are divisible by 5");
        int count = 10;
        int divisibility_count = 0;
        while (count>0){
            System.out.println("Write your number");
            int input = my_sc.nextInt();
            if (input%10==0){
                divisibility_count++;
            }
            count--;
        }
        System.out.println(divisibility_count+" entered numbers were divisible by 10.");
    }
}
//java test 2
//    int num = my_sc.nextInt();
//    int fact = 1;
//    int i = 1;
//        while (i<=num){
//                fact = fact*i;
//                i++;
//                }
//                System.out.println(fact);
//java test 1
//System.out.println("WAP to enter two numbers (A and B) and print A^B");
//        int a = my_sc.nextInt();
//        System.out.println("Enter power number or something idrk");
//        int b = my_sc.nextInt();
//        int x = b;
//        int y = 1;
//        while(x>0){
//        y = y*a;
//        x--;
//        }
//        System.out.println(y);
//