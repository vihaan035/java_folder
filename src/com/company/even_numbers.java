//wap to enter a numbers till the user wants and count number of even numbers
package com.company;
import java.util.Scanner;
public class even_numbers {
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        int choice = 1;
        int positive = 0;
        while (choice==1){
            System.out.println("Enter a number and this program will count the number of even numbers.");
            int input = my_sc.nextInt();
            System.out.println("Press 1 to enter more numbers, Press any other number to exit Exit.!");
            choice = my_sc.nextInt();
            if(input%2==0){
                positive++;
            }
        }
        System.out.println("The Number of Positive Numbers: " + positive);

//        int input = my_sc.nextInt();
//        int positive = 1;
//        System.out.println("Enter the number");
//        int input2 = my_sc.nextInt();
//        while (choice == 1) {
//            if (input % 2 == 0) {
//                positive++;
//                System.out.println("Do you want to continue? Press 1");
//            }
//            else {
//                System.out.println("Do you want to continue?");
//            }
//        }
    }
}