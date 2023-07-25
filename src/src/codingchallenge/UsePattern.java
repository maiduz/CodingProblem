package src.codingchallenge;

public class UsePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // loop to control the rows
            for (int j = 1; j <= i; j++) {  // loop to control the columns
                System.out.print(i);
            }
            System.out.println();  // print a new line after each row
        }
    }
}
