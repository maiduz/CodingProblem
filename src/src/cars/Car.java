package src.cars;

public class Car {

   String name;
    String color;
    int price;

    public Car(String name,String color,int price){
       this.name=name;
       this.color=color;
        this.price=price;

    }

    public static void main(String[] args) {
        Car obj=new Car("BMW","Black",10);
        System.out.println("1."+"I Like the name:"+obj.name);
        System.out.println("this color is my fav:"+obj.color);
        System.out.println("Price is good:"+obj.price);
/*
this is my first obj
 */

        Car obj1=new Car("Subaru","Black",10);
        Car obj2=new Car("Honda","Black",10);
/*
this is my second obj
 */
        System.out.println("2."+"I Like the name:"+obj1.name);
        System.out.println("this color is my fav:"+obj1.color);
        System.out.println("Price is good:"+obj1.price);
/*
this is my third obj
 */

        System.out.println("3."+"I Like the name:"+obj2.name);
        System.out.println("this color is my fav:"+obj2.color);
        System.out.println("Price is good:"+obj2.price);



    }



}
