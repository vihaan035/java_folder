package com.company;
import java.util.Scanner;

class perimeter_and_area{
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = my_sc.nextInt();
        int answer_perimeter = length*4;
        int answer_area = length*length;
        System.out.println("Your Perimeter is: " + answer_perimeter);
        System.out.println("Your Area is: " + answer_area);

    }
}
