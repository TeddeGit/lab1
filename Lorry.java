import java.awt.*;
import java.util.Objects;
import java.util.Stack;
import java.lang.Math;


public class Lorry extends Truck {
    private double position;
    private Stack<Car> cars; //ANGER TYPEN SOM CAR





    public Lorry(){
        setNrDoors(2);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Lorry");
        stopEngine();
        cars = new Stack<>();
        this.ramp = new Trailer();
    }

    public double exactDistance(Car car){
        return Math.pow((Math.pow((this.getX() - car.getX()), 2) + (Math.pow((this.getY() - car.getY()), 2))), 0.5 );
    }

    public boolean carIsClose(Car car) {
        return exactDistance(car) < 5;
    }

    public void load(Car car){
        if (ramp.isDown() && !trailerFull()
                && getLength() <= 5 && getWidth() <= 2 && carIsClose(car)) {
            cars.push(car);
            car.setY(getY()); // Skriv tester för detta
            car.setX(getX());
        }
    }

    private boolean trailerFull() {
        return cars.size() >= 8;
    }

    public void unload(){
        if (ramp.isDown() && !cars.empty()){
            Car car = cars.pop();

            if ("NORTH".equals(getDirection())){ //Fråga TA
                car.setY(getY()-10);
            }
            else if ("EAST".equals(getDirection())){
                car.setX(getX()-10);
            }
            else if ("SOUTH".equals(getDirection())){
                car.setY(getY()+10);
            }
            else if ("WEST".equals(getDirection())){
                car.setX(getX()+10);
            }
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
        if ((getCurrentSpeed() >= 0) && (getCurrentSpeed() <= getEnginePower())) { //Gör if satsen till en metod som man använder i varje if som är lika.
            setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);            //Minskar koddduplicering ökar läsbarhet
        }
    }

    public void move() {
        super.move(); //Gör allt som den gör i superklassen
        for (Car car : cars) { //För varje objekt av typ car i listan cars
            car.setY(getY());
            car.setX(getX());
            car.setDirection(getDirection());
        }
    }

}
