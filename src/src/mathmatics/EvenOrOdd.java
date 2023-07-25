package src.mathmatics;


import java.util.Scanner;

// Write a Java program that checks if a number is even or odd using if else statement.
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Take the number\n below");
      //  int num=scanner.nextInt();
          int num=scanner.nextInt(); //reading the input from keyboard.

    //public static void useOfIfElse(int number) {
        if (num % 2 == 0) { //number divide by two to get modulo
           System.out.println( "this number is even");
        } else {
          System.out.println( "this number is odd");
        }
        scanner.close();
    }

    //public static void main(String[] args) {
      //  useOfIfElse(17);
    }

