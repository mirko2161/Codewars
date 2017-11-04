package kata;

/**
 * See https://www.codewars.com/kata/find-the-odd-int
 *
 * Given an array, find the int that appears an odd number of times. There will always be only one
 * integer that appears an odd number of times. *
 *
 * @author mirko
 */
public class FindOdd {

    public static int findIt(int[] array) {

        int count = 0;
        for (int i : array) {
            for (int j : array) {
                if (i == j) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                return i;
            }
        }
        return -1; // should never reach
    }
}
