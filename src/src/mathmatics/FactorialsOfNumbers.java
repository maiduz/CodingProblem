package src.mathmatics;

import java.util.Scanner;

//Write a Java program to find the factorial of a number using while loop.

public class FactorialsOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        input.close();

        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
