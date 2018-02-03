package com.codility.missingInteger;

import java.util.HashSet;
import java.util.Set;

// MissingInteger
class Solution {

    public int solution(int[] A) {

        int minimal = 1;

        final Set<Integer> set = new HashSet<>();

        for (final int i : A) {
            set.add(i);
        }

        while (set.contains(minimal)) {
            minimal = minimal + 1;
        }

        return minimal;
    }
}
