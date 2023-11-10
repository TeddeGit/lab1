import java.awt.*;
import java.security.KeyStore;

public class Volvo240 extends Car implements Movable { //Subklass

    private final static double trimFactor = 1.25;
    public Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    public void  incrementSpeed(double amount) {
        if ((currentSpeed >= 0) && (currentSpeed <= enginePower)) {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
        }
    }

    public void decrementSpeed(double amount){
        if ((currentSpeed >= 0) && (currentSpeed <= enginePower)) {
            currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0); //Math.max allt < 0 så 0
        }
    }

}
