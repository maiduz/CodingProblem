package src.codingchallenge;
//Write a program to print the following pattern using nested for loops(right triangle).
public class RightTrianglePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // loop to control the rows
            for (int j = 5; j >= 1; j--) {  // loop to control the columns
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.println(j);
                }
            }
            System.out.println("p");  // print a new line after each row
        }
    }
}

