package com.company;
//import java.util.Scanner;

public class star_pyramid_pattern {
    public static void main(String []args){
//        Scanner my_sc = new Scanner(System.in)
        int spaces = 6;
        String stars = "";
        int i = 6;
        while (i>0){
            stars = stars+"*";
            i--;
            for(int x = 1; x<spaces; x++){
                System.out.print(" ");
            }
            System.out.println(stars);
            spaces--;
        }
    }
}
