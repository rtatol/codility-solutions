package com.codility.binaryGap;

// binary gap
// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
class Solution {

    public int solution(int N) {

        final String bin = Integer.toBinaryString(N);

        int best = 0;
        int current = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (current > best) {
                    best = current;
                }
                current = 0;
            } else {
                current = current + 1;
            }
        }

        return best;
    }
}
