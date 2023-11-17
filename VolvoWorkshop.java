public class VolvoWorkshop extends Workshop<Volvo240>{

    static int workshopSize;

    public VolvoWorkshop() {
        workshopSize = 5;
        yWPosition = 500;
        xWPosition = 500;
    }


    public int amountCars(){
        return cars.size();
    }

    private boolean workshopSpaceLeft(){
        return workshopSize >= amountCars();
    }
    @Override
    public void addCar(Volvo240 car){
        if (workshopSpaceLeft()){
            cars.add(car); //Bytte access till public i workshop, vet ej om det är bra.
        }
    }


}
