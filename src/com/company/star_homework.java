package com.company;
import java.util.Scanner;
public class star_homework {
    public static void main(String []args){
        int size = 25;
        int pos = 0;
        for(int i = 0; i<size; i++){
            if(pos % 5 == 0){
                System.out.println();
            }
            System.out.print("*");
            pos++;
        }
    }
}
