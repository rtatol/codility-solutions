package com.codility.tapeEquilibrium;

// TapeEquilibrium
// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
class Solution {

    public int solution(int[] A) {

        int sumLeft = A[0];
        int sumRight = 0;
        for (int i = 1; i < A.length; i++) {
            sumRight = sumRight + A[i];
        }

        int minimal = Math.abs(sumLeft - sumRight);

        for (int i = 1; i < A.length - 1; i++) {

            sumLeft += A[i];
            sumRight -= A[i];

            final int current = Math.abs(sumLeft - sumRight);

            if (current < minimal) {
                minimal = current;
            }
        }

        return minimal;
    }
}
