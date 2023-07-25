package src.mathmatics;

import java.util.Scanner;

public class GradePoint {

    //Write a Java program to determine the grade of a student based on their marks using switch statement.

   // public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the marks of the student: ");
            int marks = scanner.nextInt();

            int percentage = (marks * 100) / 100; // assuming total marks is 100

            char grade;
            switch (percentage / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }

            System.out.println("The grade of the student is: " + grade);
        }
    }



        /*int grade = 68;
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            default:
                System.out.println("F");

        }
    }*/



