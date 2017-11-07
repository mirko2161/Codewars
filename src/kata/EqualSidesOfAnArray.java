package kata;

/**
 * See https://www.codewars.com/kata/equal-sides-of-an-array
 *
 * You are going to be given an array of integers. Your job is to take that array and find an index
 * N where the sum of the integers to the left of N is equal to the sum of the integers to the right
 * of N. If there is no index that would make this happen, return -1.
 *
 * For example:
 *
 * Let's say you are given the array {1,2,3,4,3,2,1}: Your function will return the index 3, because
 * at the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the
 * right side of the index ({3,2,1}) both equal 6.
 *
 * Input: An integer array of length 0 < arr < 1000. The numbers in the array can be any integer
 * positive or negative.
 *
 * Output: The lowest index N where the side to the left of N is equal to the side to the right of
 * N. If you do not find an index that fits these rules, then you will return -1.
 *
 * Note: If you are given an array with multiple answers, return the lowest correct index. An empty
 * array should be treated like a 0 in this problem.
 *
 * @author mirko
 */
public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] array) {

        int sumOfLeft = 0, sumOfRight = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                for (int j = 1; j < array.length; j++) {
                    sumOfRight += array[j];
                }
            }

            if (sumOfLeft == sumOfRight) {
                return i;
            }

            sumOfLeft += array[i];
            if (i != array.length - 1) {
                sumOfRight -= array[i + 1];
            }
        }
        return -1;
    }

}
