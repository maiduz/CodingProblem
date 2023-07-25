package src.codingchallenge;
//Write a program to print the following pattern using nested for loops: (pyramid)
public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        int spaces = rows - 1;

        for (int i = 1; i <= rows; i++) {  // loop to control the rows
            for (int j = 1; j <= spaces; j++) {  // loop to print spaces
                System.out.print(" ");
            }
            spaces--;

            for (int j = 1; j <= i; j++) {  // loop to print digits
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {  // loop to print digits in reverse order
                System.out.print(j);
            }
            System.out.println();  // print a new line after each row
        }
    }
}
