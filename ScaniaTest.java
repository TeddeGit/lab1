import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {
    private Scania lastbil;


    @BeforeEach
    void init() {
        lastbil  = new Scania();
    }

    //@Test
   /* void decrementAngle() {
        lastbil.decrementAngle();
        assertEquals(29, lastbil.getAngle());
    }*/

    @Test
    void gas() {
        lastbil.gas(0.5);
        assertEquals(0, lastbil.getCurrentSpeed());
    }
}