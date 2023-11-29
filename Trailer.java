public class Trailer implements Ramp {

    public boolean isUp;

    public void tipUp(){
        isUp = true;

    }
    public void tipDown(){
        isUp = false;
    }



    public boolean isDown(){
        return !isUp;
    }

    public boolean isUp(){
        return isUp;
    }
}
