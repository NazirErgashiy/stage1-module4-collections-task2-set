package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> set = new TreeSet<>();
        Iterator<String> firstIterator = firstSet.iterator();
        Iterator<String> thirdIterator = thirdSet.iterator();

        while (firstIterator.hasNext()) {

            String getter = firstIterator.next();
            if (secondSet.contains(getter)) {
                set.add(getter);
            }
        }
        while (thirdIterator.hasNext()) {
            String getter = thirdIterator.next();
            if (!secondSet.contains(getter) && !firstSet.contains(getter)) {
                set.add(getter);
            }
        }
        return set;
    }
}
