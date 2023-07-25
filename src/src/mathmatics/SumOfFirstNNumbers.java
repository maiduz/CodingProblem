package src.mathmatics;

import java.util.Scanner;

//Write a Java program to find the sum of first n natural numbers using for loop.
public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

       System.out.println("The sum of the first " + n + " natural numbers is " + sum);
    }
}

