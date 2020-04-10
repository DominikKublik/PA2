import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    Truck truckTest = new Truck("1", 1, 8);

    @Test
    void checkIfFashionable() {
        assertTrue(truckTest.checkIfFashionable(8));
        assertFalse(truckTest.checkIfFashionable(12));
    }
}