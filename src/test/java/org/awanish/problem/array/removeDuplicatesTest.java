package org.awanish.problem.array;

import org.junit.Test;
import org.junit.Assert ;

public class removeDuplicatesTest {
    RemoveDuplicates rd = new RemoveDuplicates();
    @Test
    public void testRemove_allLelements_unique_method_return_arraylenght(){
        int arr[] ={1,2,3,5,7,8,9,13} ;
        int k  =rd.removeDuplicates(arr);
        Assert.assertEquals(8 ,k);
        for(int j=0 ;j<k;j++){
            System.out.println(arr[j]);
        }
    }
}
