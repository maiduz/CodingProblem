package src.mathmatics;

import java.util.Scanner;
// Write a Java program to check if a letter is a vowel or consonant using switch statement.
public class LetterIsVowelOrConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter=input.next().toUpperCase().charAt(0);

            switch (letter) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letter + " is a vowel.");
                    break;
                default:
                    System.out.println(letter + " is a consonant.");
            }

    }

}
