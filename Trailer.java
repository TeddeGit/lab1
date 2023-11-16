public class Trailer {


    private int angle = 0;

    public void tip(){
        if (angle == 70){
            angle = 0;
        }else {
            angle = 70;
        }
    }

    public boolean isDown(){
        return angle == 0;
    }


    public int getAngle() {
        return angle;
    }
}
