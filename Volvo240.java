import java.awt.*;
import java.security.KeyStore;

import static java.awt.Color.red;

public class Volvo240 extends Car implements Movable { //Subklass

    private final static double trimFactor = 1.25;
    public Volvo240(){
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        stopEngine();
    }

    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void  incrementSpeed(double amount) {
        if ((getCurrentSpeed() >= 0) && (getCurrentSpeed() <= getEnginePower())) {
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
        }
    }

    public void decrementSpeed(double amount){
        if ((getCurrentSpeed() >= 0) && (getCurrentSpeed() <= getEnginePower())) {
            setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0)); //Math.max allt < 0 så 0
        }
    }
}
