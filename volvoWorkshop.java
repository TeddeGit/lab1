public class volvoWorkshop extends Workshop<Volvo240>{

    static int workshopSize;
    public volvoWorkshop(Volvo240 car) {
        super(car);
        workshopSize = 5;
    }

    private boolean workshopSpaceLeft(){
        return workshopSize != 5;
    }

    public void addCar(Volvo240 car){
        if (workshopSpaceLeft()){
            cars.add(car); //Bytte access till public i workshop, vet ej om det är bra.
        }
    }


}
