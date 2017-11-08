package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class MovieLineTest {

    @Test
    public void test1() {
        assertEquals("YES", MovieLine.Tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", MovieLine.Tickets(new int[]{25, 100}));
    }

}
