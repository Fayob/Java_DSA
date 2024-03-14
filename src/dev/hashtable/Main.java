package dev.hashtable;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 400);

        myHashTable.printTable();

        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("table"));
        System.out.println(myHashTable.get("paints"));

        System.out.println(myHashTable.keys());

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println(itemInCommon(array1, array2));
    }

    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i : array1){
            hashMap.put(i, true);
        }

        for (int j : array2){
            if (hashMap.get(j) != null) return true;
        }

        return false;
    }
}
