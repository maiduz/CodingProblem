package src.mathmatics;

import java.util.Scanner;
// Write a Java program to find the sum of first n odd numbers using while loop.
public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        while (n > 0) {
            if (i % 2 == 1) {
                sum += i;
                n--;
            }
            i++;
        }

        System.out.println("The sum of the first " + (n + i - 1) + " odd numbers is: " + sum);
    }
}
