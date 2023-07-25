package src.cars;

import java.util.Scanner;

public class UseOfScanner {
    public static void main(String[] args) {

        Scanner name= new Scanner(System.in);
        System.out.println("Enter your First name:");
       String name1= name.nextLine();
        System.out.println("Enter Your Last Name:");
       String name2= name.nextLine();
        String fullName= name1 + name2;
        System.out.println("My full name is: "+fullName);
        System.out.println("My age is:");
        name.nextInt();

    }
}
