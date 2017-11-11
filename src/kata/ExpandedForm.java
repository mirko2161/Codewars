package kata;

import java.util.ArrayList;

/**
 * See https://www.codewars.com/kata/5842df8ccbd22792a4000245
 *
 * You will be given a number and you will need to return it as a string in Expanded Form. For
 * example:
 *
 * Kata.expandedForm(12); # Should return "10 + 2" Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 *
 * NOTE: All numbers will be whole numbers greater than 0.
 *
 * @author mirko
 */
public class ExpandedForm {

    public static String expandedForm(int num) {
        String stringNumber = Integer.toString(num);
        ArrayList<String> result = new ArrayList<>(stringNumber.length());

        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) != '0') {
                int firstDigit = Character.getNumericValue(stringNumber.charAt(i));
                int numOfZeros = stringNumber.length() - 1 - i;
                int fullNum = firstDigit * (int) Math.pow(10, numOfZeros);
                result.add(String.valueOf(fullNum));
            }
        }
        return String.join(" + ", result);
    }

}
