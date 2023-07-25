package src.collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class UseLinked {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.add(34);
        linkedList.add(98);
        linkedList.add(56);
        linkedList.add("    Name");


        //linkedList.addFirst("Sunna");
        // linkedList.addLast("Jabed");
       /* linkedList.getFirst();
        System.out.println(linkedList);
        linkedList.getFirst();
        System.out.println(linkedList);
       // for(Object ob:linkedList) {*/
        //  System.out.println(ob);
        //  }
        //linkedList.getFirst();
        //System.out.println(linkedList);
      /*  Iterator iterator=linkedList.descendingIterator();
        while(iterator.hasNext());
        System.out.println(iterator.next());*/
        Collections.sort(linkedList);
        System.out.println(linkedList);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.remove(2));

    }

}
