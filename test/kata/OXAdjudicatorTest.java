package kata;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OXAdjudicatorTest {

    @Test
    public void test1() {
        List<Integer> game1 = new ArrayList<>();
        game1.add(0);
        game1.add(1);
        game1.add(4);
        game1.add(8);
        game1.add(3);
        game1.add(6);
        game1.add(5);// X_WIN

        OXAdjudicator judge = new OXAdjudicator();
        String result = judge.judge(game1);
        assertTrue("Game1 expected result X was " + result, result.equals("X_WIN"));
    };

    @Test
    public void test2() {
        List<Integer> game2 = new ArrayList<>();
        game2.add(4);
        game2.add(2);
        game2.add(8);
        game2.add(0);
        game2.add(1);
        game2.add(7);
        game2.add(5);
        game2.add(3);
        game2.add(6); // NO_WINNER

        OXAdjudicator judge = new OXAdjudicator();
        String result = judge.judge(game2);
        assertTrue("Game2 expected result Draw was " + result, result.equals("NO_WINNER"));
    }

    @Test
    public void test3() {
        List<Integer> game3 = new ArrayList<>();
        game3.add(0);
        game3.add(2);
        game3.add(4);
        game3.add(5);
        game3.add(6);
        game3.add(8); // O_WIN

        OXAdjudicator judge = new OXAdjudicator();
        String result = judge.judge(game3);
        assertTrue("Game3 expected result O", result.equals("O_WIN"));
    }
}
