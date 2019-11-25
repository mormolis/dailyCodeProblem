package daily.coding.problem;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 * <p>
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * <p>
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * <p>
 * Follow-up: what if you can't use division?
 */
public class ProductOfAllNumbers {
    public int[] noDivisionCalculation(int[] array) {
        int product;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            product = 1;
            for (int j = 0; j < array.length; j++) {
                if (j == i) {
                    continue;
                }
                product *= array[j];
            }
            result[i] = product;
        }
        return result;
    }

    public int[] divisionCalculation(int[] array) {
        int[] result = new int[array.length];
        int product = Arrays.stream(array)
                .boxed()
                .filter(i -> i != 0)
                .reduce(1, (i1, i2) -> i1 * i2);

        if (containsZero(array)) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] == 0 ? product : 0;
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                result[i] = product / array[i];
            }
        }
        return result;
    }

    private boolean containsZero(int[] array) {
        return Arrays.stream(array).boxed().anyMatch(number -> number == 0);
    }
}
