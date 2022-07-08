package ro.fasttrackit.ex1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RecursionTest {
    @Test
    public void testFirstNEvennumbersForNegativeSigleValues() {


        int input = -5;
        int output = Recursive.sumFirstNEven(input);
        Assertions.assertEquals(30, output);

    }

    @Test
    public void testFisrtNEvenNumbersforNegativeMultipleValues() {
        int input = -24;
        int output =Recursive.sumFirstNEven(input);
        Assertions.assertEquals(600, output);
    }
}
