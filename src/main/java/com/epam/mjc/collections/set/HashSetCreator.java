package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : sourceList) {
            while (num % 2 == 0) {
                result.add(num);
                num /= 2;
                if (num % 2 != 0) {
                    result.add(num);
                    break;
                }
            }
            result.add(num);
            result.add(num * 2);
        }
        return result;
    }
}
