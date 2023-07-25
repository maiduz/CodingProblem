package src.codingchallenge;

//Write a program in Java to print out all the element of an one dimensional array.
public class OneDimensionalArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
