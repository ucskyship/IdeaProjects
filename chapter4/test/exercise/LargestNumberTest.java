package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    LargestNumber largest;

    @BeforeEach
    void setUp(){
        largest = new LargestNumber();
    }

    @Test
    void testForLargestNumber(){
        int number = 2;
        int result =  largest.totalUnits(number);
        assertEquals(number, result);
    }
}
