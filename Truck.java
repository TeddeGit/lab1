abstract public class Truck extends Car{

    private Ramp ramp;

    @Override
    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0 && (ramp != null && ramp.isDown())){
            incrementSpeed(amount);
        }
    }
}
