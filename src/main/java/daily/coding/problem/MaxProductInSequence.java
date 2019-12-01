package daily.coding.problem;

import org.hamcrest.Matcher;

/**
 *  in a sequence of numbers find the maximum product
 */
public class MaxProductInSequence {
    public static int find(int[] ints) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i : ints) {
            if (i > max1) {
                max1 = i;
                continue;
            }
            if (i > max2 || i == max1) {
                max2 = i;
            }
        }

        return max1 * max2;
    }
}
