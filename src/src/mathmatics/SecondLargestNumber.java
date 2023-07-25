package src.mathmatics;

import java.util.Scanner;
// Write a Java program to find the second largest number among n numbers using if elseif statement.
public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
