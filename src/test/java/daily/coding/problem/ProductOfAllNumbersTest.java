package daily.coding.problem;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ProductOfAllNumbersTest {

    @Test
    public void testCases() {

        ProductOfAllNumbers productOfAllNumbers = new ProductOfAllNumbers();

        assertThat(productOfAllNumbers.noDivisionCalculation(new int[]{3, 2, 1}), equalTo(new int[]{2, 3, 6}));
        assertThat(productOfAllNumbers.noDivisionCalculation(new int[]{-3, 2, 1}), equalTo(new int[]{2, -3, -6}));
        assertThat(productOfAllNumbers.noDivisionCalculation(new int[]{1, 2, 3, 4, 5}), equalTo(new int[]{120, 60, 40, 30, 24}));
        assertThat(productOfAllNumbers.noDivisionCalculation(new int[]{1, 2, 3, 4, 0}), equalTo(new int[]{0, 0, 0, 0, 24}));

    }

    @Test
    public void testCasesWithDivision() {

        ProductOfAllNumbers productOfAllNumbers = new ProductOfAllNumbers();

        assertThat(productOfAllNumbers.divisionCalculation(new int[]{3, 2, 1}), equalTo(new int[]{2, 3, 6}));
        assertThat(productOfAllNumbers.divisionCalculation(new int[]{-3, 2, 1}), equalTo(new int[]{2, -3, -6}));
        assertThat(productOfAllNumbers.divisionCalculation(new int[]{1, 2, 3, 4, 5}), equalTo(new int[]{120, 60, 40, 30, 24}));
        assertThat(productOfAllNumbers.divisionCalculation(new int[]{1, 2, 3, 4, 0}), equalTo(new int[]{0, 0, 0, 0, 24}));

    }

}