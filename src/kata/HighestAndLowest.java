package kata;

import java.util.ArrayList;
import java.util.Collections;

/**
 * See https://www.codewars.com/kata/highest-and-lowest
 *
 * You are given a string of space separated numbers, and have to return the highest and lowest
 * number.
 *
 * Example:
 *
 * HighAndLow("1 2 3 4 5") // return "5 1"
 *
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 *
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 *
 * Notes:
 *
 * All numbers are valid Int32, no need to validate them. There will always be at least one number
 * in the input string. Output string must be two numbers separated by a single space, and highest
 * number is first.
 *
 * @author mirko
 */
public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        ArrayList<Integer> ns = new ArrayList<>(nums.length);
        for (String num : nums) {
            ns.add(Integer.parseInt(num));
        }
        Collections.sort(ns);
        String res = ns.get(ns.size() - 1).toString().concat(" ").concat(ns.get(0).toString());
        return res;
    }

}
