package kata;

/**
 * Kata - https://www.codewars.com/kata/57c1ab3949324c321600013f
 *
 * Your task is to write function toLeetSpeak that converts a regular english sentence to Leetspeak.
 * More about LeetSpeak You can read at wiki -> https://en.wikipedia.org/wiki/Leet Consider only
 * uppercase letters (no lowercase letters; no numbers) and spaces. For example: toLeetSpeak("LEET")
 * returns "1337"
 *
 * In this kata we use a simple LeetSpeak dialect
 *
 * @author mirko
 */
public class ToLeetSpeak {

    static String toLeetSpeak(final String speak) {
        StringBuilder sb = new StringBuilder(speak);
        for (int i = 0; i < speak.length(); i++) {
            sb.setCharAt(i, toLeetChar(sb.charAt(i)));
        }
        return sb.toString();
    }

    private static char toLeetChar(char letter) {
        switch (letter) {
        case 'A':
            return '@';
        case 'B':
            return '8';
        case 'C':
            return '(';
        case 'E':
            return '3';
        case 'G':
            return '6';
        case 'H':
            return '#';
        case 'I':
            return '!';
        case 'L':
            return '1';
        case 'O':
            return '0';
        case 'S':
            return '$';
        case 'T':
            return '7';
        case 'Z':
            return '2';
        default:
            return letter;
        }
    }

}
