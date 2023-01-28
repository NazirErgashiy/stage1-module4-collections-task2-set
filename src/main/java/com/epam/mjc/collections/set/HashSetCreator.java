package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer integer : sourceList) {
            System.out.println(integer);
        }

        for (Integer integer : sourceList) {

            if (isEven(integer)) {
                int getter = integer;
                while (isEven(getter)) {
                    hashSet.add(getter);
                    getter /= 2;
                }
                hashSet.add(getter);
            } else {
                hashSet.add(integer);
                hashSet.add(integer * 2);
            }
        }
        return hashSet;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }
}
