package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class BitsBattleTest {

    @Test
    public void testBasicExamples1() {
        assertEquals("odds win", BitsBattle.bitsBattle(new int[]{5, 3, 14}));
    }

    @Test
    public void testBasicExamples2() {
        assertEquals("evens win", BitsBattle.bitsBattle(new int[]{3, 8, 22, 15, 78}));
    }

    @Test
    public void testBasicExamples3() {
        assertEquals("tie", BitsBattle.bitsBattle(new int[]{}));
    }

    @Test
    public void testBasicExamples4() {
        assertEquals("tie", BitsBattle.bitsBattle(new int[]{1, 13, 16}));
    }

    @Test
    public void testBasicExamples5() {
        assertEquals("tie", BitsBattle.bitsBattle(new int[]{0}));
    }

}
