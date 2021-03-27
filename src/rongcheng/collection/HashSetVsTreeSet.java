package rongcheng.collection;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetVsTreeSet {

    public static void test_order() {
        var hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(2);
        hashSet.add(81);
        System.out.println(
                hashSet.stream().map(Object::toString).collect(
                        Collectors.joining(",")
                )
        );


        var treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(2);
        treeSet.add(81);
        System.out.println(
                treeSet.stream().map(Object::toString).collect(
                        Collectors.joining(",")
                )
        );
    }

    public static void main(String[] args) {
        test_order();
    }
}
