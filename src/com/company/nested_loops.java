package com.company;

public class nested_loops {
    public static void main(String []args){
        for(int i = 1; i <=10; i++){
            for(int x = 1; x<=10; x++){
                System.out.print(i*x + "\t");
            }
            System.out.println();
//            changes line^^^^
        }
    }
}
