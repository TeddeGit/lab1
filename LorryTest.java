import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class LorryTest {
    private AdvancedTrailer advancedTrailer;

    private Lorry lastbilen;
    private Stack<Car> cars;
    @BeforeEach void init() {

            lastbilen = new Lorry();
            advancedTrailer = new AdvancedTrailer();
        }

    @Test
    void exactDistance() {
        Car car = new Saab95();
        car.setY(1);
        car.setX(1);
        lastbilen.setY(1);
        lastbilen.setX(2);
        assertEquals(1, lastbilen.exactDistance(car));
    }

    @Test
    void load() {

    }

    @Test
    void unload() {
    }

    @Test
    void tipTrailer() {
        advancedTrailer.tip(10);
        assertEquals(40, advancedTrailer.getAngle());
    }
}