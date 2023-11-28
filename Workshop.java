import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Workshop <T extends Car> {
    public List<T> cars;
    double yWPosition; //För att sedan implementera att man vara kan lasta bilar i närheten
    double xWPosition;


    public Workshop(){
        this.cars = new ArrayList<>();
    }

    public void addCar(T car){
        cars.add(car);
    }

    public void removeCar(T car){
        cars.remove(car);
    }
}
