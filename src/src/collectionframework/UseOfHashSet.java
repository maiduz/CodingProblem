package src.collectionframework;

import java.util.HashSet;

public class UseOfHashSet {


    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add("Munna");
        hashSet.add("Sunna");
        hashSet.add("Jabed");
        hashSet.add("Munna");
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);

        System.out.println(hashSet.size());
        System.out.println(hashSet.clone());
        System.out.println(hashSet.remove(1));
        System.out.println(hashSet);
        System.out.println(hashSet.remove("Munna"));
        hashSet.contains(2);
        System.out.println(hashSet);
        hashSet.clear();
        for(Object i: hashSet){
            System.out.println(i);

        }
    }
}
