import java.awt.*;

import static java.awt.Color.red;

public class Scania extends Car implements Movable {
    private int angle = 30;

    public Scania(){
        setNrDoors(2);
        setColor(Color.blue);
        setEnginePower(125);
        setModelName("Scania");
        stopEngine();
    }
    public int getAngle(){
        return angle;
    }

    public void incrementAngle(){
        if (angle < 70 && getCurrentSpeed() == 0){
            angle += 1;
        }
    }
    public void decrementAngle(){
        if (angle >= 1 && getCurrentSpeed() == 0) {
            angle -= 1;
        }

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

    public void brake(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() <= 0){
            decrementSpeed(amount);
        }
    }

    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0 && angle == 0){
            incrementSpeed(amount);
        }
    }



}
