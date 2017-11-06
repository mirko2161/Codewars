package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class JadenCasingStringsTest {

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)",
                JadenCasingStrings.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", JadenCasingStrings.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is null", JadenCasingStrings.toJadenCase(""));
    }

}
