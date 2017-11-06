package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplesOf3Or5Test {

    @Test
    public void test1() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }

    @Test
    public void test2() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
        assertEquals(78, new MultiplesOf3Or5().solution(20));
        assertEquals(9168, new MultiplesOf3Or5().solution(200));
    }

}
