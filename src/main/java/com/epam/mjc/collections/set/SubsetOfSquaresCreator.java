package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> res =  new TreeSet<>();
        if (Math.sqrt(lowerBound) % 2 == 0) {
            res.add(lowerBound);
        }
        if (Math.sqrt(upperBound) % 2 == 0) {
            res.add(upperBound);
        }
        for (Integer el : sourceList) {
            if (el * el > lowerBound && el * el <= upperBound) {
                res.add(el * el);
            }
        }
        return res;
    }
}
