package com.codility.binaryGap;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

// binary gap
// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_case() {
        // given
        final int input = 66561;

        // when
        final int result = solution.solution(input);

        // then
        assertThat(result).isEqualTo(9);
    }
}