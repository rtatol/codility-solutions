package com.codility.frogJmp;

// FrogJmp
// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
class Solution {

    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
