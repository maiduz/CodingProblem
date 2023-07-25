package src.codingchallenge;
//Write a program in Java to generate the Fibonacci series using a nested for loop.
public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 3; // Change this to the desired number of terms
        int firstTerm = 3;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + num + " terms: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
