import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolvoWorkshopTest {
    private VolvoWorkshop VolvoWork;
    private Volvo240 Volvo;


    @BeforeEach
    void init() {
        VolvoWork = new VolvoWorkshop();
        Car Volvo = new Volvo240();
    }

    @Test
    void addCar() {
        VolvoWork.addCar(Volvo);
        assertEquals(1, VolvoWork.amountCars());
    }

    @Test
    void removeCar() {
        VolvoWork.addCar(Volvo);
        VolvoWork.removeCar(Volvo);
        assertEquals(0, VolvoWork.amountCars());
    }

    @Test
    void testAddCar() {
    }
}