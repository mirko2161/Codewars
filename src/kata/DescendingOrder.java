package kata;

import java.util.Arrays;

/**
 * See https://www.codewars.com/kata/descending-order
 *
 * Your task is to make a function that can take any non-negative integer as a argument and return
 * it with its digits in descending order. Essentially, rearrange the digits to create the highest
 * possible number. Examples:
 *
 * Input: 21445 Output: 54421
 *
 * Input: 145263 Output: 654321
 *
 * Input: 1254859723 Output: 9875543221
 *
 *
 * @author mirko
 */
public class DescendingOrder {

    public static int sortDesc(int num) {
        char[] arrayOfNums = Integer.toString(num).toCharArray();
        Arrays.sort(arrayOfNums);
        StringBuilder stringNums = new StringBuilder(arrayOfNums.length);
        for (int i = arrayOfNums.length - 1; i > -1; i--) {
            stringNums.append(arrayOfNums[i]);
        }
        return Integer.valueOf(stringNums.toString());
    }

}
