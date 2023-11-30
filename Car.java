import java.awt.*;

public abstract class Car extends Vehicle {
    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0 ){
            incrementSpeed(amount);
        }
    }
}//Superklass

