public class Trailer implements Ramp {

    public boolean isUp;

    public void tip(){
        if (getCurrentSpeed == 0) {
            isUp = !isUp;
        }
    }

    public boolean isDown(){
        return !isUp;
    }

    public boolean isUp(){
        return isUp;
    }
}
