import java.awt.*;
import java.util.Stack;


public class Lorry extends Truck{
    private double position;
    private Stack<Car> cars;

    private advancedTrailer advancedTrailer;
    public Lorry(){
        setNrDoors(2);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Lorry");
        stopEngine();
        setCarPosition(0);
        cars = new Stack<>();

    }

    public void load(Car car){
        if (advancedTrailer.getAngle() == 0 && position <= 1 && cars.size() < 8){
            cars.push(car);
            car.setCarPosition(getCarPosition());
        }
    }

    public void unload(){
        if (advancedTrailer.getAngle() == 0 && !cars.empty()){
            Car car = cars.pop(); //?
            position = 0.5;
            car.setCarPosition(0);
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

}
