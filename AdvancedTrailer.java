public class AdvancedTrailer implements Ramp {
    private int angle;
    private int amount;

    public void setAngle(int i) {
        if (70 >= i && i >= 0){
            angle = i;
        }
    }

    public void tip(Truck truck,int amount) {
        if (70 >= (angle + amount) && (angle + amount) >= 0 && truck.getCurrentSpeed() == 0){
            angle += amount;
        }
    }

    public boolean isDown(){
        return angle == 0;
    }
    public boolean isUp(){
        return angle > 0;
    }
}
