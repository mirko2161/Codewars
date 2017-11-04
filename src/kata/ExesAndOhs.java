package kata;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean
 * and be case insensitive. The string can contains any char.
 *
 * Examples input/output: XO("ooxx") => true XO("xooxx") => false XO("ooxXm") => true XO("zpzpzpp")
 * => true // when no 'x' and 'o' is present should return true XO("zzoo") => false*
 *
 * @author mirko
 */
public class ExesAndOhs {

    public static boolean getXO(String str) {
        int numOfX = 0, numOfO = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'x':
                case 'X':
                    numOfX++;
                    break;
                case 'o':
                case 'O':
                    numOfO++;
                    break;
            }
        }
        return numOfX == numOfO;
    }

}
