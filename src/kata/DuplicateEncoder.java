package kata;

import java.util.HashMap;

/**
 * See https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
 *
 * The goal of this exercise is to convert a string to a new string where each character in the new
 * string is '(' if that character appears only once in the original string, or ')' if that
 * character appears more than once in the original string. Ignore capitalization when determining
 * if a character is a duplicate.
 *
 * Examples:
 *
 * "din" => "((("
 *
 * "recede" => "()()()"
 *
 * "Success" => ")())())"
 *
 * "(( @" => "))(("
 *
 * @author mirko
 */
public class DuplicateEncoder {

    static String encode(String word) {

        HashMap<Character, Integer> elementMap = new HashMap<>(word.length());
        StringBuilder result = new StringBuilder(word.length());
        char[] chars = word.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (elementMap.containsKey(ch)) {
                elementMap.put(ch, elementMap.get(ch) + 1);
            } else {
                elementMap.put(ch, 1);
            }
        }
        for (char c : chars) {
            if (elementMap.get(c) == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }

}
