package simple.recursion.exercises;

public class Recursion {

    //////////////////////////////////////////////////////////
    ///////////////FACTORIAL//////////////////////////////////
    private static int factorialHelper(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static int factorial(int number) {
        if (number < 0) {
            return (-1) * factorialHelper((-1) * number);
        }
        return factorialHelper(number);
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////
    //Write a recursive function that computes the sum of all numbers from 1 to n, where n is given as parameter.
    public static int sum(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sum(number - 1);
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    //Write a recursive function that finds and returns the minimum element in an array, where the array and its size are given as parameters.
    //////////////////////////////////////////////////////////
    public static int min(int[] array, int arrayLength) {

        preconditions(array, arrayLength);

        if (arrayLength == 1) {
            return array[0];
        }

        int[] firstHalfArray = new int[arrayLength / 2];
        System.arraycopy(array, 0, firstHalfArray, 0, arrayLength / 2);
        int[] secondHalfArray = new int[arrayLength / 2];
        System.arraycopy(array, arrayLength / 2, secondHalfArray, 0, arrayLength / 2);

        int firstHalf = min(firstHalfArray, arrayLength / 2);
        int secondHalf = min(secondHalfArray, arrayLength / 2);

        if (firstHalf < secondHalf) {
            return firstHalf;
        } else {
            return secondHalf;
        }
    }

    private static void preconditions(int[] array, int arrayLength) {
        if (array == null || array.length == 0 || arrayLength <= 0) {
            throw new IllegalArgumentException();
        }
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////
    //Write a recursive function that computes and returns the sum of all elements in an array, where the array and its size are given as parameters.
    public static int arraySum(int[] array, int arrayLength) {

        if (arrayLength == 1) {
            return array[0];
        }

        int[] restOfTheArray = new int[arrayLength - 1];
        System.arraycopy(array, 0, restOfTheArray, 0, arrayLength - 1);

        return array[arrayLength - 1] + arraySum(restOfTheArray, --arrayLength);
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    //Write a recursive function that determines whether an array is a palindrome, where the array and its size are given as parameters.
    //////////////////////////////////////////////////////////
    public static boolean isPalindrome(char[] array, int arrayLength) {

        if (array[arrayLength - 1] != array[0]) {
            return false;
        }

        if (arrayLength == 1 || (arrayLength == 2 && array[arrayLength - 1] == array[0])) {
            return true;
        }

        char[] restOfTheArray = new char[arrayLength - 2];
        System.arraycopy(array, 1, restOfTheArray, 0, arrayLength - 2);
        return isPalindrome(restOfTheArray, arrayLength - 2);
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////
    //Write a recursive function that searches for a target in a sorted array using binay search, where the array, its size and the target are given as parameters.
    public static boolean binSearch(int[] array, int arrayLength, int target) {

        if (array.length == 1 && array[0] == target) {
            return true;
        } else if (array.length == 1 && array[0] != target) {
            return false;
        }

        int middleElement = array[arrayLength / 2];
        if(middleElement > target){
            int[] firstHalfArray = new int[arrayLength / 2];
            System.arraycopy(array, 0, firstHalfArray, 0, arrayLength / 2);
            return binSearch(firstHalfArray, arrayLength/2, target);
        } else if (middleElement < target){
            int[] secondHalfArray = new int[arrayLength / 2];
            System.arraycopy(array, arrayLength / 2, secondHalfArray, 0, arrayLength / 2);
            return binSearch(secondHalfArray, arrayLength /2, target);
        }
        return true;
    }
    //////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////
}
