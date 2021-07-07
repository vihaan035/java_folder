//wap to enter a 5 digit number and print its first and last digits

package com.company;
import java.util.Scanner;

public class first_and_last_digit {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a 5 digit number to know its first and last digits if somehow you don't know it already while writing the number:");
        int x = my_sc.nextInt();
        int first_digit = x/10000;
        int last_digit = x
                %10;
        if(x>10000 && x<99999){
            System.out.println("The First Number is: " + first_digit + "\n" + "The Last Number is: " + last_digit);
        }
        else{
            System.out.println("Your Number is not 5 digits and that is currently not available");
        }

    }
}
