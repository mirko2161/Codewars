package kata;

/**
 * See https://www.codewars.com/kata/mumbling
 *
 * Examples:
 *
 * Accumul.accum("abcd"); // "A-Bb-Ccc-Dddd"
 *
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 *
 * Accumul.accum("cwAt"); // "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 *
 * @author mirko
 */
public class Accumul {

    public static String accum(String word) {
        StringBuffer newWord = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            if (i != 0) {
                newWord.append("-");
            }
            newWord.append(Character.toUpperCase(word.charAt(i)));
            for (int j = 0; j < i; j++) {
                newWord.append(Character.toLowerCase(word.charAt(i)));
            }
        }
        return newWord.toString();
    }

}
