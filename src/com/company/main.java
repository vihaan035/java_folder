package com.company;
import java.util.Scanner;

public class main {

    public static void main(String []args){
        Scanner input_int = new Scanner(System.in);
        System.out.println("If you are somehow struggling to find the last digit of your integer than write than integer below👇👇");
        int x = input_int.nextInt();
        int y = x%10;
        System.out.println("This is the last digit of your number: " + y);
    }
}
