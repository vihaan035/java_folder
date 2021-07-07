//wap to enter amount and tell how many ten rupee notes will be used and how much change is left

package com.company;
import java.util.Scanner;

public class change {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number and this program will tell you how many ten rupee notes will be used to sum up your amount:");
        int input = my_sc.nextInt();
        int notes = input/10;
        int change = input%10;
        System.out.println("The number of ten rupee notes: " + notes);
        System.out.println("The amount left in change: " + change);

    }
}
