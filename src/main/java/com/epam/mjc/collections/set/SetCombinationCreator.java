package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        for (String s: firstSet) {
            if (!thirdSet.contains(s) && secondSet.contains(s)){
                result.add(s);
            }
        }
        for (String s : thirdSet){
            if (!firstSet.contains(s) && !secondSet.contains(s)){
                result.add(s);
            }
        }
        return result;
    }
}
