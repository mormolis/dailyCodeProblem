package daily.coding.problem;

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
        int i=0;

        return max1 * max2;
    }

    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
        }
    }
}
