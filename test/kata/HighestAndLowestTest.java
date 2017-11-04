package kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class HighestAndLowestTest {

    @Test
    public void SomeTest() {
        assertThat(HighestAndLowest.HighAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    @Test
    public void PlusMinusTest() {
        assertThat(HighestAndLowest.HighAndLow("1 -1"), is("1 -1"));
    }

    @Test
    public void PlusPlusTest() {
        assertThat(HighestAndLowest.HighAndLow("1 1"), is("1 1"));
    }

    @Test
    public void MinusMinusTest() {
        assertThat(HighestAndLowest.HighAndLow("-1 -1"), is("-1 -1"));
    }

    @Test
    public void PlusMinusZeroTest() {
        assertThat(HighestAndLowest.HighAndLow("1 -1 0"), is("1 -1"));
    }

    @Test
    public void PlusPlusZeroTest() {
        assertThat(HighestAndLowest.HighAndLow("1 1 0"), is("1 0"));
    }

    @Test
    public void MinusMinusZeroTest() {
        assertThat(HighestAndLowest.HighAndLow("-1 -1 0"), is("0 -1"));
    }

    @Test
    public void SingleTest() {
        assertThat(HighestAndLowest.HighAndLow("42"), is("42 42"));
    }

}
