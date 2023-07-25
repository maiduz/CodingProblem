package src.mathmatics;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        input.close();

        int first = 0;
        int second = 1;
        int i = 1;

        if (n == 0) {
            System.out.println("No terms to display.");
        } else if (n == 1) {
            System.out.println(first);
        } else {
            System.out.print(first + " " + second + " ");
            do {
                int current = first + second;
                System.out.print(current + " ");
                first = second;
                second = current;
                i++;
            } while (i <= n - 2);
        }
    }
}
