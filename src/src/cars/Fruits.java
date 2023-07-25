package src.cars;

public class Fruits {

    int price;
    String name;

    public Fruits(int money,String call){
        price=money;
        name=call;
    }

    public static void main(String[] args) {
        Fruits nameOfTheFruits=new Fruits(10,"banana");
        Fruits nameOfTheFruits1=new Fruits(20,"Apple");
        Fruits nameOfTheFruits2=new Fruits(30,"Orange");
        System.out.println("My Favourite Fruits:"+nameOfTheFruits.name);
        System.out.println(nameOfTheFruits.price);
        System.out.println("My Favourite Fruits:"+nameOfTheFruits1.name);
        System.out.println(nameOfTheFruits1.price);
        System.out.println(nameOfTheFruits2.name);
        System.out.println(nameOfTheFruits2.price);
    }
}
