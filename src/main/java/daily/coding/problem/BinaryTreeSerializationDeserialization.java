package daily.coding.problem;

/**
 * given a bt serialise write a serialiser deserialiser
 */
public class BinaryTreeSerializationDeserialization {

    public static class Node<T extends Comparable<T>> {
        private T value;
        private Node<T> left;
        private Node<T> right;

        public Node(T value) {
            this.value = value;
        }

    }

    public static class BTree<T extends Comparable<T>> {
        public Node<T> root;

        public BTree() {
            this.root = null;
        }

        public void add(T value) {
            if (this.root == null) {
                root = new Node<>(value);
            } else {
                addRecursive(root, value);
            }
        }

        private Node<T> addRecursive(Node<T> current, T value) {

            if (current == null) {
                return new Node<>(value);
            }
            if (current.value.compareTo(value) < 0) {
                current.right = addRecursive(current.right, value);
            } else if (current.value.compareTo(value) > 0) {
                current.left = addRecursive(current.left, value);
            }
            return current;
        }

        public String traverseInOrder() {
            return traverseInOrderRecursive(root, new StringBuilder()).toString().trim();
        }

        private StringBuilder traverseInOrderRecursive(Node<T> node, StringBuilder stringBuilder) {
            if (node != null) {
                traverseInOrderRecursive(node.left, stringBuilder);
                stringBuilder.append(node.value).append(" ");
                traverseInOrderRecursive(node.right, stringBuilder);
            }
            return stringBuilder;
        }

        @SuppressWarnings(value = {"unchecked", "rawtypes"})
        public static BTree serialize(String deserializeBt) {
            BTree bTree = new BTree();
            for (String v : deserializeBt.split(" ")) {
                bTree.add(v);
            }
            return bTree;
        }


    }
}
