package src.codingchallenge;
//Write a program to reverse a string using a nested for loop.
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int length = str.length();
        String reversedStr = "";

        for (int i = length - 1; i >= 0; i--) {  // loop to iterate through the string backwards
            for (int j = i; j <= i; j++) {  // loop to append each character to the reversed string
                reversedStr += str.charAt(j);
            }
        }
        System.out.println("Reversed string: " + reversedStr);
    }
}

