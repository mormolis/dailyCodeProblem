package daily.coding.problem;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class MaxProductInSequenceTest {

    @Test
    public void test(){
        assertThat(MaxProductInSequence.find(new int[]{1,2,3,4,5,6,7,8,9,19,3,43,0,23}), equalTo(989));
        assertThat(MaxProductInSequence.find(new int[]{19,3,0,4,10,11,5,2}), equalTo(209));
        assertThat(MaxProductInSequence.find(new int[]{19,3,0,4,10,19,5,2}), equalTo(361));
        assertThat(MaxProductInSequence.find(new int[]{1,1,1,1,1}), equalTo(1));
        assertThat(MaxProductInSequence.find(new int[]{2,5,5,2,2}), equalTo(25));
    }

}