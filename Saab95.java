import java.awt.*;

import static java.awt.Color.red;

public class Saab95 extends Car implements Movable { //Subklass

    public boolean turboOn;
    
    public Saab95(){
        setNrDoors(2);
        setColor(red);
        setEnginePower(125);
	    setTurboOff();
        setModelName("Saab95");
        stopEngine();
        setWidth(1.76);
        setLength(4.63);
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
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
