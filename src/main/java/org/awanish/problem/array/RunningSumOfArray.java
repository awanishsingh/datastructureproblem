package org.awanish.problem.array;

public class RunningSumOfArray {

   //PRefix sum
    public int[] runningSum(int[] nums){

        int pSum = nums[0];
        for ( int i=1 ;i<nums.length;i++){
         pSum=pSum+nums[i];
         nums[i]=pSum;
        }
        return nums ;
    }
}
