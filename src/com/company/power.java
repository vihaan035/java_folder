package com.company;
import java.util.Scanner;


public class power {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter the Number you wanna add the power to.");
        int defnumber = my_sc.nextInt();
        System.out.println("Enter the Power Number.");
        int pownumber = my_sc.nextInt();
        int x = pownumber;
        int y = 1;
        while(x>0){
            y = y*defnumber;
            x--;
        }

        System.out.println(y);

    }
}
