package src.mathmatics;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number for a");
        int a= scr.nextInt();
        System.out.println("Enter number for b");
        int b= scr.nextInt();
        System.out.println("Enter number for c");
        int c= scr.nextInt();

       // int a = 34;
       // int b = 45;
       // int c = 20;

        if(a>b && a>c){
            System.out.println("A is the largest number");
        } else if (b>c){
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }

    }
}
