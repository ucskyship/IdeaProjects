package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {

    GasMileage gasMileage;
    @BeforeEach
    void setUp() {
        gasMileage = new GasMileage();
    }

    @Test
    @DisplayName("test that driver can input trip details")
    void testToCollectTripDetails(){
        gasMileage.allMilesDriven();
        gasMileage.allGallonPerMiles();
        double result = gasMileage.totalMilesPerGallon(10, 2);
        assertEquals(5.0, result);
    }
}