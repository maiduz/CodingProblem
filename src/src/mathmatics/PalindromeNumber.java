package src.mathmatics;

import java.util.Scanner;

// Write a Java program to check if a number is a palindrome or not using if else statement.
public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("The number " + originalNumber + " is a palindrome.");
        } else {
            System.out.println("The number " + originalNumber + " is not a palindrome.");
        }
    }
}
