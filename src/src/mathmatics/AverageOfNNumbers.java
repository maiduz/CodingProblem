package src.mathmatics;

import java.util.Scanner;

// Write a Java program to calculate the average of n numbers using while loop.
public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        double sum = 0;
        int i = 0;
        while (i < n) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();
            sum += num;
            i++;
        }

        double average = sum / n;
        System.out.println("The average of the " + n + " numbers is: " + average);

        input.close();
    }
}
