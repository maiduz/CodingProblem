package src.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {


    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        ArrayList<Integer> integerArrayList = new ArrayList<>();


        arrayList.add("Name");
        arrayList.add(9);
        arrayList.add(9.0);
        arrayList.add('A');
        arrayList.add(1,"Munna");
        System.out.println(arrayList.contains(9.0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        Iterator iterator = arrayList.iterator();
        //for(Object a: arrayList){
          //  System.out.print("\t "+" " +a);
       // }
        while (iterator.hasNext()){
            System.out.println("\t" + iterator.next());
        }


    }
}
