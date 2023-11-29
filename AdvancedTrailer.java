public class AdvancedTrailer implements Ramp {
    private int angle;
    private int amount;

    public void setAngle(int i) {
        if (70 >= i && i >= 0){
            angle = i;
        }
    }

    public void tipUp() {
        if (angle <= 65){
            angle += 5;
        }
    }
    public void tipDown(){
        if ((angle >= 5)){
            angle -= 5;
        }
    }

    public boolean isDown(){
        return angle == 0;
    }
    public boolean isUp(){
        return angle > 0;
    }
}
