import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Saab95Test {
    private Saab95 bilen2;

    @BeforeEach
    void init() {
        bilen2 = new Saab95();
    }

    @Test
    void speedFactor(){
        assertEquals(1.25, bilen2.speedFactor());
    }

    @Test
    void setTurboOn(){
        bilen2.setTurboOn();
        assertTrue(bilen2.turboOn);
    }

    @Test
    void setTurboOff(){
        bilen2.setTurboOff();
        assertFalse(bilen2.turboOn);
    }

    @Test
    void getNrDoors() {
        assertEquals(2, bilen2.getNrDoors());
    }

    @Test
    void getEnginePower() {
        assertEquals(125, bilen2.getEnginePower());
    }

    @Test
    void getCurrentSpeed() {
        assertEquals(0, bilen2.getCurrentSpeed());
    }

    @Test
    void getColor() {
        assertEquals(Color.red, bilen2.getColor());
    }

    @Test
    void setColor() {
        bilen2.setColor(Color.blue);
        assertEquals(Color.blue, bilen2.getColor());
    }

    @Test
    void startEngine() {
        bilen2.startEngine();
        assertEquals(0.1, bilen2.getCurrentSpeed());
    }

    @Test
    void stopEngine() {
        bilen2.stopEngine();
        assertEquals(0, bilen2.getCurrentSpeed());
    }

    @Test
    void move() {
        bilen2.setCurrentSpeed(2.0);
        bilen2.move();
        assertEquals(2.0, bilen2.y);

    }

    @Test
    void turnLeft() {
        bilen2.turnLeft();
        assertEquals("WEST", bilen2.direction);
    }

    @Test
    void turnRight() {
        bilen2.turnRight();
        assertEquals("EAST", bilen2.direction);
    }

    @Test
    void incrementSpeed() {
        bilen2.incrementSpeed(0.5);
        assertEquals(0.625, bilen2.currentSpeed);
    }

    @Test
    void decrementSpeed() {
        bilen2.decrementSpeed(0.5);
        assertEquals(-0.625, bilen2.currentSpeed);
    }

    @Test
    void gas() {
        bilen2.gas(0.5);
        assertEquals(0.625, bilen2.getCurrentSpeed());
    }

    @Test
    void brake() {
        bilen2.brake(0.5);
        assertEquals(-0.625, bilen2.getCurrentSpeed());
    }
}