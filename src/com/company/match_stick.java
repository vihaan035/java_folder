//the user will enter 5 numbers and we have to add them using while loop.
package com.company;
import java.util.Scanner;

public class match_stick {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        int x = 0;
        int choice = 5;
        System.out.println("Enter Number of matchboxes and this program will print total number of matchsticks.");
        while (choice>0){
            int input = my_sc.nextInt();
            choice--;
            x = x + input;
        }
        System.out.println("The Total Number of Mathsticks: " + x);
    }
}
