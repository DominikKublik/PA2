import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilkTest {
    Milk milk = new Milk("1", 1, 25);

    @Test
    void checkIfGoesSour() {
        assertTrue(milk.checkIfGoesSour(20));
        assertTrue(milk.checkIfGoesSour(25));
        assertFalse(milk.checkIfGoesSour(30));
    }

    public void setup(){
        Cafeteria cafeteria = Cafeteria.getInstance();
        cafeteria.clearCafeteria();
        milk.cleanUp();
        milk.cleanUp();
    }
    @Test
    void cleanUp(){
        setup();
        Cafeteria cafeteria = Cafeteria.getInstance();
        assertArrayEquals(new Milk[]{milk, milk}, cafeteria.getProducts().toArray());
        assertEquals(milk, cafeteria.getProducts().get(0));
        assertEquals(2, cafeteria.getProducts().size());
    }
}