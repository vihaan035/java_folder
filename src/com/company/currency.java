//wap to enter an amount and print its currency value
//example for 2,550 its currency value is 2000 + 500 + 50
//example2 for 4,960 its currency value is 2000 * 2 + 500 + 100 * 4 + 50 * 1 + 10 * 1
//homework: is change1 necessary in any value given?, reason..
//what can be the maximum value of coin1
package com.company;
import java.util.Scanner;

public class currency{
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("Enter a number and this program will tell you how many ten rupee notes will be used to sum up your amount:");

//        change
        int input = my_sc.nextInt();
        int note2000 = input/2000;
        int change2000 = input%2000;
        int note500 = change2000/500;
        int change500 = change2000%500;
        int note100 = change500/100;
        int change100 = change500%100;
        int note50 = change100/50;
        int change50 = change100%50;
        int note10 = change50/10;
        int change10 = change50%10;
        int coin5 = change10/5;
        int change5 = change10%5;
        int coin2 = change5/2;
        int change2 = change5%2;
        int coin1 = change2/1;
//        int change1 = change2%1; never to be used
        System.out.println("The number of notes:");
        System.out.println("2000 Notes: " + note2000);
        System.out.println("500 Notes: " + note500);
        System.out.println("100 Notes: " + note100);
        System.out.println("50 Notes: " + note50);
        System.out.println("10 Notes: " + note10);
        System.out.println("5 Coins: " + coin5);
        System.out.println("2 Coins: " + coin2);
        System.out.println("1 Coins: " + coin1);

    }
}
