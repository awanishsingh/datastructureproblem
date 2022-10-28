package org.awanish.problem.array;

public class MergeTwoSortedArray {


    public static  int[]  mergeTowArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int ret[] = new int[arr1.length + arr2.length];
        //Array is sorted .so we need to traverse and compare the element .
        //push the min(arr1[i] ,arr2[j]) to result and advance the index.
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                ret[k++] = arr2[j++];
            } else {
                ret[k++] = arr1[i++];
            }

        }
        //in case of left over we need to check items remain to compare .
        //copy thoese in same order to result
        if (i < arr1.length) {
            while (i < arr1.length) {
                ret[k++] = arr1[i++];
            }
        }
        if (j < arr2.length) {
            while (j < arr2.length) {
                ret[k++] = arr2[j++];
            }
        }

        return ret ;
    }
}
