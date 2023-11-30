abstract public class Truck extends Vehicle{

    protected Ramp ramp;


    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0 && (ramp != null && ramp.isDown())){
            incrementSpeed(amount);
        }
    }
    public boolean speedCheck(){
        return getCurrentSpeed() == 0;
    }

    public void callTipUp(){
        if (speedCheck()){
            ramp.tipUp();
        }
    }
    public void callTipDown(){
        if (speedCheck()){
            ramp.tipDown();
        }
    }
}
