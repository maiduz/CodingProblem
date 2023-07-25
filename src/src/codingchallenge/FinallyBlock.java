package src.codingchallenge;
//Write a program to demonstrate the use of the finallyblock in Java exception handling.
public class FinallyBlock {
    public static void length () {
        String name=null;
        try{
            int p = name.length();
            System.out.println(p);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        }finally {
            name="Munna";
            System.out.println(name);
        }

    }
}
