//wap to e  nter a numbers till the user wants and count number of even numbers
package com.company;
import java.util.Scanner;
public class even_numbers {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number and this program will count the number of even numbers.");
        System.out.println("Press one to start!");
        int choice = 1;
        int input = my_sc.nextInt();
        int positive = 1;
        System.out.println("Enter the number");
        int input2 = my_sc.nextInt();
        while (choice == 1) {
            if (input % 2 == 0) {
                positive++;
                System.out.println("Do you want to continue? Press 1");
            }
            else {
                System.out.println("Do you want to continue?");
            }
        }
    }
}





