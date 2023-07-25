package src.cars;

public class UseOfIf {

    public static void monthsOfTheYear(int num){

        if (num == 1){
            System.out.println("This si the first months of the year");
        }else if (num == 2) {
            System.out.println("This si the 2nd months of the year");
        }
           else if (num == 3){
                System.out.println("This si the 3rd months of the year");
           }

             else if (num == 4) {
            System.out.println("This si the 4rth months of the year");
        }
             else {
            System.out.println("There is no month");
        }

    }

    public static void main(String[] args) {
        monthsOfTheYear(3);
        monthsOfTheYear(5);
        monthsOfTheYear(7);
    }














}
