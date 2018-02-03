package com.codility.tapeEquilibrium;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_case_1() {
        // given
        final int A[] = {3, 1, 2, 4, 3};

        // when
        final int result = solution.solution(A);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test_case_2() {
        // given
        final int A[] = {3, 1};

        // when
        final int result = solution.solution(A);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_case_3() {
        // given
        final int A[] = {-1000, 1000};

        // when
        final int result = solution.solution(A);

        // then
        assertThat(result).isEqualTo(2000);
    }

    @Test
    public void test_case_4() {
        // given
        final int A[] = {-3, -1, -2, -4, -3};

        // when
        final int result = solution.solution(A);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test_case_5() {
        // given
        final int A[] = {-10, -5, -3, -4, -5};

        // when
        final int result = solution.solution(A);

        // then
        assertThat(result).isEqualTo(3);
    }
}