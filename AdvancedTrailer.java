public class AdvancedTrailer extends Trailer {
    private int amount;

    public void tip(int amount) {
        if (70 >= (angle + amount) && (angle + amount) >= 0){
            angle += amount;
        }
    }
}
