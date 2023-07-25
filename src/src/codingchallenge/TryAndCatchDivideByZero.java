package src.codingchallenge;

public class TryAndCatchDivideByZero {

    public static void main(String[] args) {
        int a=10;
        int b=0;

      try {
        int div = a/b;
        System.out.println(div);
    } catch (ArithmeticException e) {
        System.out.println("Error: " +e.getMessage());
        System.out.println("Cannot divide by zero.");
    }
}
}
