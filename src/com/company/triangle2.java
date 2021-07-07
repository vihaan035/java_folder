//wap to enter three sides of a triangle and check whether the triangle is isosceles ,equilateral, scalene or triangle
//                                                                         two side    all sides    no sides
package com.company;
import java.util.Scanner;

public class triangle2 {
    public static void main(String []args){
        Scanner my_sc = new Scanner(System.in);
        System.out.println("This Program will help you find the type of triangle.");
        System.out.printf("Enter the first value:");
        int x = my_sc.nextInt();
        System.out.printf("Enter the second value:");
        int y = my_sc.nextInt();
        System.out.printf("Enter the third value:");
        int z = my_sc.nextInt();

        if(x>y+z||y>z+x||z>x+y){
            System.out.println("The values given cannot make a triangle.");
        }
        else{
            if(x==y&&y==z&&z==x){
                System.out.println("This is an Equilateral triangle.");
            }
            else if(x==y||y==z||z==x){
                System.out.println("This is an Isosceles triangle.");
            }
            else{
                System.out.println("This is a Scalene triangle.");
            }
        }


    }
}
