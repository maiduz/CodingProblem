package src.collectionframework;

import java.util.HashMap;

public class UseOfHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Munna", 35);
        hashMap.put("Sunna", 33);
        hashMap.put("Jabed", 30);
        hashMap.put("Munira", 25);

        for (String i : hashMap.keySet()) {
            System.out.println(i);

        }
        for(String i: hashMap.keySet()){
            System.out.println("Key: "+i+", Value: "+hashMap.get(i));
        }
        System.out.println(hashMap.size());
        System.out.println(hashMap.clone());
        hashMap.remove("Munna");
        System.out.println(hashMap.remove("Munna"));
        hashMap.clear();
        System.out.println(hashMap);
        hashMap.put("mmm".toUpperCase(),33);
        System.out.println(hashMap);



    }
}
