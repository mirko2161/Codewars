package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class DetectPangramTest {

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        DetectPangram dp = new DetectPangram();
        assertEquals(true, dp.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        DetectPangram dp = new DetectPangram();
        assertEquals(false, dp.check(pangram2));
    }
}
