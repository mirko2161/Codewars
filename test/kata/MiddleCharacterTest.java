package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class MiddleCharacterTest {

    public MiddleCharacterTest() {
    }

    @Test
    public void evenTests() {
        assertEquals("es", MiddleCharacter.getMiddle("test"));
        assertEquals("dd", MiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", MiddleCharacter.getMiddle("testing"));
        assertEquals("A", MiddleCharacter.getMiddle("A"));
    }

}
