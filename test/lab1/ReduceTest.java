package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  Some simple test cases for reduce.
 */
public class ReduceTest {


    @org.junit.Test
    @Test
    public void testReduce() {
        assertEquals(9,
                Reduce.reduce(100),
                "Reduce.reduce(100) is incorrect");
    }

    @org.junit.Test
    @Test
    public void testReduceTwoHundred() {
        assertEquals(10,
                Reduce.reduce(200),
                "Reduce.reduce(200) is incorrect");
    }

    @Test
    public void testReduceFortyTwo() {
        assertEquals(8,
                Reduce.reduce(42),
                "Reduce.reduce(42) is incorrect");
    }

    @org.junit.Test
    @Test
    public void testReduceOne() {
        assertEquals(1,
                Reduce.reduce(1),
                "Reduce.reduce(1) is incorrect");
    }

    @org.junit.Test
    @Test
    public void testReduceTwo() {
        assertEquals(2,
                Reduce.reduce(2),
                "Reduce.reduce(2) is incorrect");
    }
}