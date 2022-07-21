package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    TaxCalculator myTaxCal;

    @BeforeEach
    void setUp() {
        myTaxCal = new TaxCalculator();
    }

    @Test
    void testForTaxPercentage(){
        int earning = 10000;
        int result = myTaxCal.taxPercentage(earning);
        assertEquals(1500, result);
    }
}
