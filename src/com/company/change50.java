//wap to enter amount and tell how many 50 rupee notes will be used and balance the change using ten rupee notes and print the final change

package com.company;
import java.util.Scanner;

public class change50 {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number and this program will tell you how many ten rupee notes will be used to sum up your amount:");
        int input = my_sc.nextInt();
        int notes = input/50;
        int change = input%50;
//        System.out.println("The number of ten rupee notes: " + notes);
        int notes10 = change/10;
        int notes10change = change%10;
        System.out.println("The amount of 50 notes, 10 notes and the change left: ");
        System.out.println("50 notes: " + notes);
        System.out.println("10 notes: " + notes10);
        System.out.println("The change left: " + notes10change);

    }
}
