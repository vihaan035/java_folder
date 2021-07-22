//armstrong numbers are thsoe numbiers if sum of cubes of each digits = the number itself
//for example:
//153 = 1*1*1 + 5*5*5 + 3*3*3
package com.company;
import java.util.Scanner;

public class armstrong_number {
    public static void main(String []args){
        System.out.println("Enter a number to find if its armstrong or not.");
        Scanner my_sc = new Scanner(System.in);
        int i = my_sc.nextInt();
        int x = i;
        int sum = 0;
        while (x>0){
            int digits = x%10;
            sum = (sum+digits*digits*digits);
            x = x/10;

        }
        System.out.println(sum);
        if(sum==i){
            System.out.println("This is an armstrong number.");
        }
        else{
            System.out.println("This is not an armstrong number.");
        }
    }
}
