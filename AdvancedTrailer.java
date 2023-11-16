public class AdvancedTrailer extends Trailer {
    private int amount;
    private int angle = getAngle();


    public void tip(int amount) {
        if (70 >= (angle + amount) && (angle + amount) >= 0){
            angle += amount;
        }
    }
}
