import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Workshop <T> {
    public List<T> cars;

    public Workshop(T car){
        this.cars = new ArrayList<>();
    }

    public void addCar(T car){
        cars.add(car);
    }

    public void removeCar(T car){
        cars.remove(car);
    }




}
