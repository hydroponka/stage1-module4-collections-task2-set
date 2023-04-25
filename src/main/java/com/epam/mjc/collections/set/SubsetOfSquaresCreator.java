package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new HashSet<>();
        for(Integer num : sourceList){
            if (Math.pow(num,2) >= lowerBound && Math.pow(num,2)<=upperBound){
                result.add((int) Math.pow(num,2));
            }
        }
        return result;
    }
}
