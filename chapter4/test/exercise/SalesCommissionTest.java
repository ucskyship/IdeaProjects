package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionTest {
    SalesCommission mySalesCal;

    @BeforeEach
    @DisplayName("mySalesCal class object initialization")
    void setUp(){
        mySalesCal = new SalesCommission();
    }

    @Test
    void testForSales(){
        int totalSales = 5000;
        int result = mySalesCal.total(totalSales);
        assertEquals(650, result);
        System.out.println("totalSales is: " + totalSales);
        System.out.println("SalesPerson commission is : " + result);
    }
}
