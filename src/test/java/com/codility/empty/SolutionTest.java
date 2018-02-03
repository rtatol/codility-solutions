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

        System.out.println("Input: ");
        System.out.println(input);
        final long startTime = System.currentTimeMillis();

        // when
        final Object result = solution.solution(input);

        System.out.println("Result: ");
        System.out.println(result);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: ");
        System.out.println(elapsedTime);

        // then
        assertThat(result).isEqualTo(input);
    }



}