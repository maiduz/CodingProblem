package src.mathmatics;

import java.util.Scanner;
//Write a Java program to calculate the sum of first n even numbers using do while loop.
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i += 2;
            n--;
        } while (n > 0);

        System.out.println("The sum of the first " + (n + i / 2) + " even numbers is: " + sum);
    }
}
