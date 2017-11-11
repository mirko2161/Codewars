package kata;

import java.util.ArrayList;
import java.util.Collections;

/**
 * See https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
 *
 * You have an array of numbers. Your task is to sort ascending odd numbers but even numbers must be
 * on their places.
 *
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to
 * return it.
 *
 * Example: sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 *
 * @author mirko
 */
public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        ArrayList<Integer> oddList = new ArrayList<>(array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddList.add(array[i]);
            }
        }
        Collections.sort(oddList);

        for (int i = 0, j = 0; i < oddList.size(); i++, j++) {
            while (array[j] % 2 == 0) {
                j++;
            }
            array[j] = oddList.get(i);
        }
        return array;
    }

}
