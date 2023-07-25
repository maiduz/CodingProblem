package src.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 12) {
                it.remove();
            }
        }
        System.out.println(numbers);
        for(Integer j: numbers){
            System.out.println(j);
        }
    }
}


