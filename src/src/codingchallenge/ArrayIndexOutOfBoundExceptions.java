package src.codingchallenge;
//Write a program to demonstrate the use of try-catch for handling ArrayIndexOutOfBoundsException.
public class ArrayIndexOutOfBoundExceptions {

    public static void main(String[] args) {


        int[] arr = {5, 15, 23, 45, 76};


        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error"+e.getMessage());
        }



    }
}
