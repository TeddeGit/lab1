import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Workshop <T extends Car> {
    public List<T> cars;
    double yWPosition; //För att sedan implementera att man vara kan lasta bilar i närheten
    double xWPosition;

    int maxCars;


    public Workshop(int maxAmountOfCars){
        maxCars = maxAmountOfCars;
        this.cars = new ArrayList<>();
    }

    public void addCar(T car){
        if(!workshopFull())
            cars.add(car);
    }

    public void removeCar(T car){
        cars.remove(car);
    }
    public boolean workshopFull(){
        return cars.size() == maxCars;
    }
}
