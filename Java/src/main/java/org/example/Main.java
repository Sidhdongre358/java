package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // collections

        // List

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Orange");

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Grapes");
        linkedList.add("Watermelon");

        // SET

        Set<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("John");
        treeSet.add("Alice");
        treeSet.add("Devid");

        // MAP

        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("key1", "Value1");
        hashMap.put("key2", "Value2");
        hashMap.put("key3", "Value3");

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "Value1");
        hashtable.put("key3", "Value3");
        hashtable.put("key2", "Value2");

        for (String i : arrayList
        ) {
            System.out.println(i);
        }

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Stream API
        hashSet.stream().forEach(System.out::println);
        treeSet.stream().forEach(System.out::println);

        System.out.println(hashMap.size());
        System.out.println(hashtable.size());

    }
}