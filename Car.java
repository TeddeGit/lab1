import java.awt.*;

public class Car { //Superklass

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    String direction = "NORTH";
    double y = 0;
    double x = 0;

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
}
