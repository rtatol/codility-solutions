package com.codility.oddOccurrencesInArray;

import java.util.HashSet;
import java.util.Set;

// OddOccurrencesInArray
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
class Solution {

    public int solution(final int[] A) {

        final Set<Integer> set = new HashSet<>();

        for (int i : A) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }

        return set.iterator().next();
    }
}
