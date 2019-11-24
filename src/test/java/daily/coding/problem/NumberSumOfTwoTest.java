package daily.coding.problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSumOfTwoTest {

    @Test
    public void testCasesBruteforce(){
        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] array2 = new int[]{5,2,11,4,3,6,7,41,9};


        NumberSumOfTwo numberSumOfTwo = new NumberSumOfTwo();

        assertTrue(numberSumOfTwo.isThereASumOfTwo(array1, 13));
        assertTrue(numberSumOfTwo.isThereASumOfTwo(array2, 13));
        assertTrue(numberSumOfTwo.isThereASumOfTwo(array2, 10));
        assertFalse(numberSumOfTwo.isThereASumOfTwo(array2, 40));
        assertFalse(numberSumOfTwo.isThereASumOfTwo(array2, 99));
        assertFalse(numberSumOfTwo.isThereASumOfTwo(array2, 1));
    }

    @Test
    public void testCasesOnePass(){
        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] array2 = new int[]{5,2,11,4,3,6,7,41,9};


        NumberSumOfTwo numberSumOfTwo = new NumberSumOfTwo();

        assertTrue(numberSumOfTwo.onePass(array1, 13));
        assertTrue(numberSumOfTwo.onePass(array2, 13));
        assertTrue(numberSumOfTwo.onePass(array2, 10));
        assertFalse(numberSumOfTwo.onePass(array2, 40));
        assertFalse(numberSumOfTwo.onePass(array2, 99));
        assertFalse(numberSumOfTwo.onePass(array2, 1));
    }

}