package simple.recursion.exercises;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ReursionTest {

    @Test
    public void factorialTest() {
        assertThat(Recursion.factorial(7), equalTo(5040));
        assertThat(Recursion.factorial(10), equalTo(3628800));
        assertThat(Recursion.factorial(0), equalTo(1));
        assertThat(Recursion.factorial(-2), equalTo(-2));
    }

    @Test
    public void sumTest() {
        assertThat(Recursion.sum(0), equalTo(0));
        assertThat(Recursion.sum(1), equalTo(1));
        assertThat(Recursion.sum(2), equalTo(3));
        assertThat(Recursion.sum(5), equalTo(15));
        assertThat(Recursion.sum(8), equalTo(36));
    }

    @Test
    public void minTest() {
        assertThat(Recursion.min(new int[]{6, 2, 9, 9}, 4), equalTo(2));
        assertThat(Recursion.min(new int[]{89, 5, 43, 41, 3, 55, 6, 2, 9, 9}, 10), equalTo(2));
        assertThat(Recursion.min(new int[]{89, 5, -1, 41, 3, 55, 6, 2, 9, 9}, 10), equalTo(-1));
        assertThat(Recursion.min(new int[]{89, 5, -1, 3, 55, 6, 2, 9, 9}, 9), equalTo(-1));
        try {
            assertThat(Recursion.min(new int[]{}, 9), equalTo(-1));
            assertThat(Recursion.min(null, 9), equalTo(-1));
            assertThat(Recursion.min(new int[]{1}, -9), equalTo(-1));
            assertThat(Recursion.min(new int[]{1}, 0), equalTo(-1));
            fail();
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void arraySumTest(){
        assertThat(Recursion.arraySum(new int[]{1,2,3,4}, 4), equalTo(10));
        assertThat(Recursion.arraySum(new int[]{1,2,3,4,10}, 5), equalTo(20));
    }

    @Test
    public void isPalindromeTest(){
        assertTrue(Recursion.isPalindrome(new char[]{'a','b','c','c','b','a'}, 6));
        assertFalse(Recursion.isPalindrome(new char[]{'a','b','c','c','d','a'}, 6));
        assertFalse(Recursion.isPalindrome(new char[]{'a','b','c','c','d'}, 5));
        assertTrue(Recursion.isPalindrome(new char[]{'a','b','c','b','a'}, 5));
        assertFalse(Recursion.isPalindrome(new char[]{'a','b','c','c','a'}, 5));
    }

    @Test
    public void binSearchTest() {
        assertTrue(Recursion.binSearch(new int[]{1,2,3,4,5,6,7,8}, 8,6));
        assertFalse(Recursion.binSearch(new int[]{1,2,3,4,5,6,7,8}, 8,10));
    }

}