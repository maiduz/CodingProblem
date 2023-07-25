package src.oop;

public class Runner extends UseOfAbstract{
    @Override
    public void group() {
        System.out.println("I studied in Engineering");
    }

    public static void main(String[] args) {

        Runner obj = new Runner();

        String name1=obj.name;
        int age1= obj.age;
        obj.group();
        System.out.println("Name: "+name1+ " Age "+age1);
        year();


    }









}
