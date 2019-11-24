package daily.coding.problem;

import java.util.Arrays;

/**
 * This problem was recently asked by Google.
 * <p>
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * <p>
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * <p>
 * Bonus: Can you do this in one pass?
 */
public class NumberSumOfTwo {
    public boolean isThereASumOfTwo(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] + array[j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onePass(int[] array, int number) {
        int sum;
        Arrays.sort(array);
        for (int i = 0, j = array.length - 1; i < j; ) {
            sum = array[i] + array[j];

            if (sum == number) {
                return true;
            }

            if (sum < number) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
