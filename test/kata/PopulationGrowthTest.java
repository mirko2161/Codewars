package kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class PopulationGrowthTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        testing(PopulationGrowth.nbYear(1500, 5, 100, 5000), 15);
        testing(PopulationGrowth.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(PopulationGrowth.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

}
