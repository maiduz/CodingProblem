package src.mathmatics;

import java.util.Scanner;

// Write a Java program to reverse a string using for loop.
public class ReverseString {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println(("Enter the name of String"));
        String str = sca.nextLine(); //user input into scanner
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
            System.out.println("Reversed string: " + reversed);

    }

}


