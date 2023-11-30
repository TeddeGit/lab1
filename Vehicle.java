import java.awt.*;

abstract public class Vehicle {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    String direction;
    private double y;
    private double x;
    private double length;
    private double width;

    public Vehicle() {
        x = 0;
        y = 0;
        direction = "NORTH";
        currentSpeed = 0;
    }

    public Vehicle(int x, int y, String direction, int currentSpeed) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.currentSpeed = currentSpeed;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }


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

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    protected abstract void decrementSpeed(double amount); //Lite som interface
    protected abstract void incrementSpeed(double amount);


    public void brake(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() <= 0){
            decrementSpeed(amount);
        }
    }


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


