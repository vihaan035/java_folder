package com.company;
import java.util.Scanner;

public class extracting_digits_test {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number to find the number of digits in it.");
        int num_input = my_sc.nextInt();
        System.out.println("Enter a Second Number.");
        int sec_input = my_sc.nextInt();
        int x = num_input;
        int digits_storage = 0;
        int modular_data = 0;
        num_input = num_input*10;
        int ans = num_input+sec_input;
        System.out.println(ans);
//        while(x>0){
//            modular_data = modular_data+x%10;
//            x = x/10;
//            digits_storage++;
//        }
//        System.out.println("Number of Digits: "+digits_storage);
//        System.out.println("Sum of Digits: "+modular_data);
    }

}
