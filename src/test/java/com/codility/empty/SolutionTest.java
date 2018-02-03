package com.codility.empty;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

// missing integer
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_case() {
        // given
        final Object input = new Object();

        // when
        final Object result = solution.solution(input);

        // then
        assertThat(result).isEqualTo(input);
    }

}