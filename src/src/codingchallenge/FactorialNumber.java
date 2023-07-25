package src.codingchallenge;
//Write a program to find the factorial of a given number using a nested for loop.
public class FactorialNumber {
    public static void main(String[] args) {
        int num = 3; // Change this to the desired number
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
        }

        System.out.println("The factorial of " + num + " is " + factorial);
    }
}

