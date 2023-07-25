package src.cars;

public class UseSwitch {
    public static void main(String[] args) {
          int number=65;
        switch (number/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
