package src.codingchallenge;
//Write a program to demonstrate the use of wrapper classes in Java by converting a string to an integer and then to a float.
public class WrapperClass {
    public static void main(String[] args) {
        String str = "56789";
        Integer intObj = Integer.valueOf(str);
        float floatNum = intObj.floatValue();
        System.out.println("String: " + str);
        System.out.println("Integer: " + intObj);
        System.out.println("Float: " + floatNum);
    }
}
