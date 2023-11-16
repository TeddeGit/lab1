import java.awt.*;
import java.util.Objects;
import java.util.Stack;
import java.lang.Math;


public class Lorry extends Truck {
    private double position;
    private Stack<Car> cars;

    private AdvancedTrailer advancedTrailer;
    public Lorry(){
        setNrDoors(2);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Lorry");
        stopEngine();
        setCarPosition(0);
        cars = new Stack<>();

    }

    public double exactDistance(Car car){
        return Math.pow((Math.pow((this.getX() - car.getX()), 2) + (Math.pow((this.getY() - car.getY()), 2))), 0.5 );
    }

    public boolean carIsClose(Car car) {
        return exactDistance(car) < 5;
    }

    public void load(Car car){
        if (advancedTrailer.getAngle() == 0 && position <= 1 && cars.size() < 8){
            cars.push(car);
            car.setY(getY()); // Skriv tester för detta
            car.setX(getX());
        }
    }

    private boolean trailerFull() {
        return cars.size() >= 8;
    }

    public void unload(){
        if (advancedTrailer.isDown() && !cars.empty()){
            Car car = cars.pop();

            if (Objects.equals(getDirection(), "NORTH")){
                car.setY(getY()-10);
            }
            else if (Objects.equals(getDirection(), "EAST")){
                car.setX(getX()-10);
            }
            else if (Objects.equals(getDirection(), "SOUTH")){
                car.setY(getY()+10);
            }
            else if (Objects.equals(getDirection(), "WEST")){
                car.setX(getX()+10);
            }
        }

    }

    public void tipTrailer(int angle) {
        if (getCurrentSpeed() == 0) {
            advancedTrailer.tip(angle);
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

    public void move() {
        super.move();
        for (Car car : cars) {
            car.setY(getY());
            car.setX(getX());
            car.setDirection(getDirection());
        }
    }

}
