package com.codility.cyclicRotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

// CyclicRotation
// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test_case_1() {
        // given
        final int A[] = {3, 8, 9, 7, 6};
        final int K = 3;

        // when
        final int[] result = solution.solution(A, K);

        // then
        assertThat(result).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }

    @Test
    public void test_case_2() {
        // given
        final int A[] = {};
        final int K = 3;

        // when
        final int[] result = solution.solution(A, K);

        // then
        assertThat(result).isEqualTo(new int[]{});
    }
}