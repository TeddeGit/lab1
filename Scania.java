import java.awt.*;

import static java.awt.Color.red;

public class Scania extends Truck implements Movable {
    private Trailer trailer; //Skapar detta en trailer?
    private double angle = 30;

    public Scania(){
        setNrDoors(2);
        setColor(Color.blue);
        setEnginePower(125);
        setModelName("Scania");
        stopEngine();
    }

    public double speedFactor(){
        return getEnginePower() * 0.05;
    }

    public void incrementSpeed(double amount){
        if ((getCurrentSpeed() >= 0) && (getCurrentSpeed() <= getEnginePower())) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
        }
    }

    public void decrementSpeed(double amount){
        if ((getCurrentSpeed() >= 0) && (getCurrentSpeed() <= getEnginePower())) {
            setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }
    }
}
