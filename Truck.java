abstract public class Truck extends Car{

    public abstract boolean isDown();

    @Override
    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0 && isDown()){
            incrementSpeed(amount);
        }
    }
}
