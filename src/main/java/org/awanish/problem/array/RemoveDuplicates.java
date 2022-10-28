package org.awanish.problem.array;

public class RemoveDuplicates {

    /**
     * By analyzing the above three key observations, we can derive the following algorithm,
     *     Start both indexes (k, i) from 1.
     *     insertIndex and i represents our First and second Index respectively.
     *     Check if the previous element is different from the current element
     *     The previous element is the element just before our i index i.e element present at arr[i-1]
     *     If found different then perform arr[k] = arr[i] and increment k by 1
     *     Increment i index by 1 till we reach end of the array
     *     Note: After reaching the end of the array, our k variable will hold the
     *     count of unique elements in our input array.
     */

    public int removeDuplicates(int[] nums) {
        int k=1;
        //K will grow till length
        for ( int i=1 ;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[k++]=nums[i];
            }
        }
        return k ;
    }
    }

