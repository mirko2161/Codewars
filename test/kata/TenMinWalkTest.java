package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class TenMinWalkTest {

    @Test
    public void Test1() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @Test
    public void Test2() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    }

    @Test
    public void Test3() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w'}));
    }

    @Test
    public void Test4() {
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
