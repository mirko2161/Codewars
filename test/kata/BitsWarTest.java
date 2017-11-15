package kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class BitsWarTest {

    static String ODDS = "odds win";
    static String EVENS = "evens win";
    static String TIE = "tie";

    @Test
    public void basicBitsWarTests1() {
        assertThat(BitsWar.bitsWar(new int[]{1, 5, 12}), is(ODDS));
    }

    @Test
    public void basicBitsWarTests2() {
        assertThat(BitsWar.bitsWar(new int[]{7, -3, 20}), is(EVENS));
    }

    @Test
    public void basicBitsWarTests3() {
        assertThat(BitsWar.bitsWar(new int[]{7, -3, -2, 6}), is(TIE));
    }

    @Test
    public void basicBitsWarTests4() {
        assertThat(BitsWar.bitsWar(new int[]{-3, -5}), is(EVENS));
    }

    @Test
    public void basicBitsWarTests5() {
        assertThat(BitsWar.bitsWar(new int[]{}), is(TIE));
    }
}
