package kata;

/**
 * See https://www.codewars.com/kata/decode-the-morse-code
 *
 * The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the
 * letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−. The Morse code
 * is case-insensitive, traditionally capital letters are used. When the message is written in Morse
 * code, a single space is used to separate the character codes and 3 spaces are used to separate
 * words. For example, the message HEY JUDE in Morse code is ···· · −·−− ·−−− ··− −·· ·.
 *
 * NOTE: Extra spaces before or after the code have no meaning and should be ignored.
 *
 * The Morse code table is preloaded for you as a dictionary, feel free to use it. All the test
 * strings would contain valid Morse code, so you may skip checking for errors and exceptions.
 *
 * @author mirko
 */
public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        String[] words = morseCode.split("   ");
        String[][] letters = new String[words.length][];

        int i = 0;
        StringBuilder message = new StringBuilder(letters.length);
        for (String word : words) {
            letters[i] = word.split(" ");
            for (String letter : letters[i]) {
                // requires to be run with the helper class at the kata terminal
//                String decoded = MorseCode.get(letter);
//                if (decoded != null) {
//                    message.append(decoded);
//                }
            }
            message.append(" ");
            i++;
        }
        return message.toString().trim();
    }

}
