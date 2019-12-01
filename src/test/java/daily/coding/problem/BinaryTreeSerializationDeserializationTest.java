package daily.coding.problem;

import org.junit.Test;

import static daily.coding.problem.BinaryTreeSerializationDeserialization.BTree;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinaryTreeSerializationDeserializationTest {

    @Test
    public void traverseTest() {
        BTree<Integer> bt = new BTree<>();
        bt.add(2);
        bt.add(3);
        bt.add(5);

        System.out.println(bt.traverseInOrder());
        assertThat(bt.traverseInOrder(), equalTo("2 3 5"));
    }

    @Test
    @SuppressWarnings(value = {"rawtypes"})
    public void deserializeTest() {
        BTree bTree = BTree.serialize("5 4 3 2 1");

        assertThat(bTree.traverseInOrder(), equalTo("1 2 3 4 5"));
    }
}