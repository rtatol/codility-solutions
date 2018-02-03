package com.codility.cyclicRotation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

// CyclicRotation
// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
class Solution {

    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        final LinkedList<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        while (K > 0) {
            list.addFirst(list.getLast());
            list.removeLast();
            K--;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
