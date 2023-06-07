package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();
        for (Integer el : sourceList) {
            if (el % 2 == 0){
                res.add(el);
                while (el % 2 == 0){
                    res.add(el /= 2);
                }
            } else {
                res.add(el);
                res.add(el*2);
            }
        }
        return res;
    }
}
