import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Volvo240Test {
    private Volvo240 bilen;

    @BeforeEach
    void init() {
        bilen = new Volvo240();
    }

    @Test
    void speedFactor() {
        assertEquals(1.25, bilen.speedFactor());
    }

    @Test
    void incrementSpeed() {
        bilen.incrementSpeed(0.5);
        assertEquals(0.625, bilen.currentSpeed);
    }

    @Test
    void decrementSpeed() {
        bilen.decrementSpeed(0.5);
        assertEquals(0, bilen.currentSpeed);
    }

    @Test
    void gas() {
        bilen.gas(0.5);
        assertEquals(0.625, bilen.getCurrentSpeed());
    }

    @Test
    void brake() {
        bilen.brake(0.5);
        assertEquals(0, bilen.getCurrentSpeed());
    }
}