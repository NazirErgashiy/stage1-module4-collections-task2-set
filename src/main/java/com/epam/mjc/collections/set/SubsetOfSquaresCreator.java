package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (Integer integer : sourceList) {
            list.add(integer * integer);
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
        for (int getter : linkedHashSet) {
            if (getter >= lowerBound && getter <= upperBound) {
                set.add(getter);
            }
        }
        return set;
    }
}
