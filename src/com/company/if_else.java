//wap to enter a number and print the number only if it is greater than 0
//wap2 check if it is larger than 0; if so than print it else print number is not greater
//wap3 to enter a number and check whether it is positive, negative or 0.
package com.company;
import java.util.Scanner;

public class if_else {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number and this program will only print it if it is greater than 0:");
        int input = my_sc.nextInt();
        if(input>0){
            System.out.println("The Number is positive.");
        }
        else if(input<0){
            System.out.println("The Number is negative.");
        }
        else{
            System.out.println("The Number is 0.");
        }

    }
}
