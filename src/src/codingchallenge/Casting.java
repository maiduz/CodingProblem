package src.codingchallenge;
//Write a program to demonstrate type casting in Java by converting a float to an int and then to a double.
public class Casting {
    public static void main(String[] args) {
        float floatNum = 5.7f;
        int intNum = (int) floatNum; // cast float to int
        double doubleNum = (double) intNum; // cast int to double
        System.out.println("Float: " + floatNum);
        System.out.println("Integer: " + intNum);
        System.out.println("Double: " + doubleNum);
    }
}
