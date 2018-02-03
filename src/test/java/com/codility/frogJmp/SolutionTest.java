package com.codility.frogJmp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_case() {
        // given
        final int x = 10;
        final int y = 85;
        final int d = 30;

        // when
        final int result = solution.solution(x, y, d);

        // then
        assertThat(result).isEqualTo(3);
    }
}