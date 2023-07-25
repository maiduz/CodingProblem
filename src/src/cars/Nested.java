package src.cars;

public class Nested {

    public static void nestedIf (int num) {

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("This is even number");
            } else {
                System.out.println("THis is odd number");
            }
            }else{
                System.out.println("THis is positive or negative number");
            }

    }

    public static void main(String[] args) {
        nestedIf(5);
    }

}
