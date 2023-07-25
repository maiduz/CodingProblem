package src.cars;

public class Example {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 26;
        arr[1] = 54;
        arr[2] = 8;
        arr[3] = 4;
        arr[4] = 39;

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.println(min);
    }
    }












