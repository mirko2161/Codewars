package kata;

/**
 * See https://www.codewars.com/kata/jaden-casing-strings
 *
 * Your task is to convert strings to how they would be written by Jaden Smith. The strings are
 * actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed
 * them.
 *
 * Example:
 *
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real" Jaden-Cased: "How Can Mirrors
 * Be Real If Our Eyes Aren't Real"
 *
 * Note that the Java version expects a return value of null for an empty string or null.
 *
 * @author mirko
 */
public class JadenCasingStrings {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(phrase);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for (int i = 0; i < phrase.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
            }
        }
        return sb.toString();
    }

}
