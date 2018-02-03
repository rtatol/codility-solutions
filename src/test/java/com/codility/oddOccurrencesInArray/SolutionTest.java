package com.codility.oddOccurrencesInArray;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

// OddOccurrencesInArray
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test_case() {
        // given
        final int[] input = {9, 3, 9, 3, 9, 7, 9};

        // when
        final int result = solution.solution(input);

        // then
        assertThat(result).isEqualTo(7);
    }
}