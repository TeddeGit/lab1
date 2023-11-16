abstract public class Truck extends Car{
    private Trailer trailer;
    public void attatchTrailer(){
        trailer = new Trailer();
    }
    public void detachTrailer(){
        trailer = null;
    }
    public boolean hasTrailer(){
        return trailer != null;
    }
    @Override
    public void gas(double amount){
        if (amount >= 0 && amount <= 1 && getCurrentSpeed() >= 0 && trailer.isDown()){
            incrementSpeed(amount);
        }
    }
}
