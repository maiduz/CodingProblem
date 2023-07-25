package src.homework;

import java.util.Arrays;


public class Exception {

    public static void main(String[] args) {
        // System.out.println(reverse("Munna"));
        int[] num = {1, 10, 6, 8, 20, 15, 12, 45, 32};
        int[] num1 = {6, 7, 8};
        System.out.println(Arrays.toString(num)); //one
        int le = num.length;
        int last = le - 1;
        for (int i = 0; i <= last; i++) //two
            System.out.print(num[i] + "  ");

        int a = num1.length;

        int st = a - 1;
        for (int i = 0; i <= a - 1; i++) //getting all element using for loop
            System.out.print(num1[i] + "  ");

        for (int i : num) { //three
            System.out.print(i + " ");
        }
        Arrays.sort(num);
        System.out.print("Sort of numbers: " + Arrays.toString(num));


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(Arrays.toString(cars));

        int [] num5= new int[4];
        num5[0]=45;
        num5[1]=55;
        num5[2]=65;
        num5[3]=75;
        System.out.println(Arrays.toString(num5));
        for(int i=0; i<num5.length;i++)
            System.out.println(num5[i]);
        for(int i: num5){
            System.out.println(i);
        }
        num5[1]=85;
        System.out.println(Arrays.toString(num5));
        num5.clone();
        System.out.println(Arrays.toString(num5));
        Arrays.sort(num5);
        System.out.println(Arrays.toString(num5));
        Arrays.sort(num5);
        System.out.println(Arrays.toString(num5));
        System.out.println(Arrays.binarySearch(num5,65));
        System.out.println(Arrays.binarySearch(num5,75));
        System.out.println(num5[2]);
        System.out.println(num5[1]);
        System.out.println(Arrays.binarySearch(num5,95));
         int [] num12 = num1.clone();
        System.out.println(Arrays.toString(num12));
         Arrays.fill(num12,70);
        System.out.println(Arrays.toString(num12));

       // for (int i = 0; i < cars.length; i++)

        //    System.out.print(" "+cars[i]);

       // for(String i: cars){
          //  System.out.println(" "+i);
       // }




      /*  static String reverse (String Str){

            String rev = " ";
            for (int i = 0; i < Str.length(); i++) {
                rev = Str.charAt(i) + rev;
            }
            return rev;
*/

    }
}