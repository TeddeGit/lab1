import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrailerTest {
    private Trailer Trail;

    @BeforeEach
    void init() {
        Trail = new Trailer();
    }

    @Test
    void tip() {
        Trail.setAngle(0);
        Trail.tip();
        assertEquals(70, Trail.getAngle());
    }

    @Test
    void isDown() {
        Trail.setAngle(0);
        assertTrue(Trail.isDown());
    }
}