package src.mathmatics;

//Write a Java program to check if a year is a leap year or not using if elseif statement.
public class LeapYear {

    public static void main(String[] args) {

        int year=1700;
   // public static void leapYear(int year) {
        if ((year % 4 == 0)&& (year % 100 != 0) ||(year % 400 == 0) ) {
            System.out.println(year+" is a leap year ");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
       /* int year=1700;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");*/
        }




