package com.company;
import java.util.Scanner;

public class odd_or_even {

    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("Write any integer to identify if it is odd or even");
        int x = my_scanner.nextInt();
        System.out.println("You Wrote " + x + ",");
        if(x%2 == 0){
            System.out.println("The Number is even");
        }
        else{
            System.out.println("The Number is odd");
        }
    }
}
