package org.awanish.problem.array;

import org.junit.Assert;
import org.junit.Test;

public class RunningSumOfArrayTest {

    RunningSumOfArray rs= new RunningSumOfArray();
    @Test
    public void  testSum_Test1(){
        int nums[] = {1,2,3,4};
        int expected [] ={1,3,6,10};

        Assert.assertArrayEquals(expected ,rs.runningSum(nums));
    }

    @Test
    public void  testSum_Test2(){
        int nums[] = {1,1,1,1,1};
        int expected [] ={1,2,3,4,5};

        Assert.assertArrayEquals(expected ,rs.runningSum(nums));
    }
}
