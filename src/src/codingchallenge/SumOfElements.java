package src.codingchallenge;
//Write a program in Java to calculate the sum of the elements of an array using nested for loops and exception handling.
public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    sum += j;
                }
            }
            System.out.println("The sum of the elements of the array is " + sum);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
