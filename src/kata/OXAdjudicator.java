package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * See https://www.codewars.com/kata/os-and-xs-adjudicator
 *
 * Write a method to determine the outcome of a game of O's and X's. https://en.wikipedia.org/wiki/Tic-tac-toe
 *
 * The method public String judge(List<Integer> history) accepts a List of Integer objects representing the move history
 * of both players in order as zero indexed offsets. The board squares are numbered with on offset as follows:
 *
 * 012
 *
 * 345
 *
 * 678
 *
 * The X player makes the first move. The method should return a String, either "X_WIN", "O_WIN", or "NO_WINNER", to
 * indicate the outcome of the game.
 *
 * Input is guaranteed to represent a valid Os and Xs game.
 *
 * @author Mirko
 */
public class OXAdjudicator {

    public String judge(List<Integer> history) {
        List<List<Integer>> winners = new ArrayList<>();
        winners.add(Arrays.asList(0, 3, 6));
        winners.add(Arrays.asList(1, 4, 7));
        winners.add(Arrays.asList(2, 5, 8));
        winners.add(Arrays.asList(0, 1, 2));
        winners.add(Arrays.asList(3, 4, 5));
        winners.add(Arrays.asList(6, 7, 8));
        winners.add(Arrays.asList(0, 4, 8));
        winners.add(Arrays.asList(2, 4, 6));

        List<Integer> xMoves = new ArrayList<>();
        List<Integer> oMoves = new ArrayList<>();
        for (int i = 0; i < history.size(); i++) {
            if (i % 2 == 0) {
                xMoves.add(history.get(i));
            } else {
                oMoves.add(history.get(i));
            }
        }
        for (List<Integer> winner : winners) {
            if (xMoves.containsAll(winner)) {
                return "X_WIN";
            }
            if (oMoves.containsAll(winner)) {
                return "O_WIN";
            }
        }
        return "NO_WINNER";
    }

}
