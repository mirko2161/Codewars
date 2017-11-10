package kata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DuplicateEncoderTest {

    @Test
    public void testEncode1() {
        assertEquals("", DuplicateEncoder.encode(""));
    }

    @Test
    public void testEncode2() {
        assertEquals("(", DuplicateEncoder.encode("1"));
    }

    @Test
    public void testEncode3() {
        assertEquals("))", DuplicateEncoder.encode("ee"));
    }

    @Test
    public void testEncode4() {
        assertEquals("((", DuplicateEncoder.encode("d9"));
    }

    @Test
    public void testEncode5() {
        assertEquals("())", DuplicateEncoder.encode("wHH"));
    }

    @Test
    public void testEncode6() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
    }

    @Test
    public void testEncode7() {
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

}
