package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> res = new HashSet<>();
        for (String el: firstSet) {
            if (firstSet.contains(el) && secondSet.contains(el) && !(thirdSet.contains(el))) {
                res.add(el);
            }
        }
        for (String el: thirdSet) {
            if (!(secondSet.contains(el)) && !(firstSet.contains(el))) {
                res.add(el);
            }
        }
        return res;
    }
}
