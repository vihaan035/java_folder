package com.company;
import java.util.Scanner;

public class triangle {
    public static void main(String []args){
        System.out.println("You have to enter the angle of the three sides of your triangle." + "\n" + "This program will tell you that your triangle is possible or not.");
        Scanner my_sc = new Scanner(System.in);
        System.out.println("First Value:");
        int x = my_sc.nextInt();
        System.out.println("Second Value:");
        int y = my_sc.nextInt();
        System.out.println("Third Value:");
        int z = my_sc.nextInt();
        int a = x+y+z;
        if(a == 180){
            System.out.println("Your triangle is possible");
        }
        else{
            System.out.println("Your triangle is not possible");
        }
    }
}
