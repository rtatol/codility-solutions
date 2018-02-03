package com.codility.missingInteger;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

// MissingInteger
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_case() {
        // given
        final int[] input = {-1, 1, 2, 3, 500, -500};

        // when
        final int result = solution.solution(input);

        // then
        assertThat(result).isEqualTo(4);
    }
}