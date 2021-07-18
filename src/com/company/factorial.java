package com.company;
import java.util.Scanner;

public class factorial {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        int number = my_sc.nextInt();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}