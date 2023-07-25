package src.collectionframework;

import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        LinkedList <String> list1= new LinkedList<>();

        list.add(45);
        list.add(35);
        list.add(67);
        list.add(98);

        list1.add("Munna");
        list1.add("sunna");
        list1.add("jabed");

       // System.out.println(list);
        //System.out.println(list1);

      //  Iterator iterator = list1.descendingIterator();
      //  while (iterator.hasNext()){
       //     System.out.println(iterator.next());
       // }
       // System.out.println(list);
       // Collections.sort(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());
    }

}
