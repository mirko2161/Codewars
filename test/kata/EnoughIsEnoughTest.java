package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class EnoughIsEnoughTest {

    @Test
    public void deleteNth1() throws Exception {
        assertArrayEquals(new int[]{20, 37, 21}, EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1));
    }

    @Test
    public void deleteNth2() throws Exception {
        assertArrayEquals(new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3));
    }

    @Test
    public void deleteNth3() throws Exception {
        assertArrayEquals(new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3));
    }

    @Test
    public void deleteNth4() throws Exception {
        assertArrayEquals(new int[]{1, 1, 1, 1, 1},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 1, 1, 1}, 5));
    }

    @Test
    public void deleteNth5() throws Exception {
        assertArrayEquals(new int[]{}, EnoughIsEnough.deleteNth(new int[]{}, 5));
    }

}
