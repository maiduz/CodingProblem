package src.mathmatics;

import java.util.Scanner;
// Write a Java program to calculate the sum of digits of a number using while loop.
public class SumOfDigit {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
    int number = input.nextInt();
    int sum = 0;
        while (number > 0) {
        sum += number % 10;
        number /= 10;
    }
        System.out.println("Sum of digits: " + sum);
}
}

