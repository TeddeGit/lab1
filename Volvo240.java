import java.awt.*;
import java.security.KeyStore;

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
        return enginePower * 0.01 * trimFactor;
    }

    public void  incrementSpeed(double amount) {
        if ((currentSpeed >= 0) && (currentSpeed <= enginePower)) {
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
        }
    }

    public void decrementSpeed(double amount){
        if ((getCurrentSpeed() >= 0) && (getCurrentSpeed() <= getEnginePower())) {
            setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0)); //Math.max allt < 0 så 0
        }
    }

    public void brake(double amount){
        if (amount >= 0 && amount <= 1 && currentSpeed <= 0){
            decrementSpeed(amount);
        }
    }

    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && currentSpeed >= 0 ){
            incrementSpeed(amount);
        }
    }

}
