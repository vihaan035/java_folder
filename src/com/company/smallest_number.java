package com.company;
import java.util.Scanner;
public class smallest_number {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;
        int choice = 4;
        System.out.println("Enter 5 numbers and this program will tell you the smallest and the largest number.");
        int input1 = my_sc.nextInt();
        smallest=input1;
        largest=input1;
        while(choice>0){
            int input = my_sc.nextInt();
            choice--;
            if(input<smallest){
                smallest=input;
            }
            if(input>largest){
                largest=input;
            }
        }
        System.out.println("The smallest Number is: " + smallest);
        System.out.println("The Largest Number is: " + largest);
    }
}
