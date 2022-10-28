package org.awanish.problem.array;

import org.junit.Test;

import java.util.Arrays;

import static org.awanish.problem.array.MergeTwoSortedArray.*;

public class MergeTwoSortedArrayTest {

    @Test
    public void testMergerTwoSortedArray(){

        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        int[] ret = mergeTowArray(arr1, arr2);
        Arrays.stream(ret).forEach(System.out::println);
    }
}
