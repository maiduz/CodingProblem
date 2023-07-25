package src.codingchallenge;
// Write a program in Java to print the multiplication table using nested for loops.
public class PrintMultiplication {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i* j + "\t");
            }
            System.out.println("*");
        }
    }
}
