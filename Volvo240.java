import java.awt.*;

public class Volvo240 extends Car implements Movable { //Subklass

    String direction = "NORTH";
    double y = 0;
    double x = 0;
    private final static double trimFactor = 1.25;

    public void move() {
        if ("NORTH".equals(direction)) {
            y += getCurrentSpeed();

        } else if ("WEST".equals(direction)) {
            x -= getCurrentSpeed();

        } else if ("SOUTH".equals(direction)) {
            y -= getCurrentSpeed();

        } else if ("EAST".equals(direction)) {
            x += getCurrentSpeed();
        }
    }
    public void turnLeft(){
        if("NORTH".equals(direction)){
            direction = "WEST";
        }
        else if("WEST".equals(direction)){
            direction = "SOUTH";

        }
        else if("SOUTH".equals(direction)){
            direction = "EAST";
        }

        else if("EAST".equals(direction)){
            direction = "NORTH";
        }

    }

    public void turnRight(){
        if("NORTH".equals(direction)){
            direction = "EAST";
        }
        else if("WEST".equals(direction)){
            direction = "NORTH";

        }
        else if("SOUTH".equals(direction)){
            direction = "WEST";
        }

        else if("EAST".equals(direction)){
            direction = "SOUTH";
        }
    }

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

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
