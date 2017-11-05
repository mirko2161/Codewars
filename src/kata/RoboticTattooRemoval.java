package kata;

/**
 * See https://www.codewars.com/kata/57658f3dedc6f7a751000e7b
 *
 * The task is to create a function for the robot function that will zap away the Xs and replace
 * them with *s. Any array values that are not Xs must be left alone. See tests for examples.
 *
 * @author mirko
 */
public class RoboticTattooRemoval {

    public static String[][] robot(String[][] skinScan) {
        for (int row = 0; row < skinScan.length; row++) {
            for (int column = 0; column < skinScan[row].length; column++) {
                if (skinScan[row][column].equals("X")) {
                    skinScan[row][column] = "*";
                }
            }
        }
        return skinScan;
    }

}
