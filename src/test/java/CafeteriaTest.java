import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {
    Cafeteria cafeteria = Cafeteria.getInstance();

    @Mock
    Milk milk;

    public void setup(){
        for (int i = 0; i < 10; i++) {
            cafeteria.addToCafeteria(new Milk(Integer.toString(i), i, i));
        }
    }
    @Test
    void addToCafeteriaTest() {
        cafeteria.addToCafeteria(milk);
        assertArrayEquals(new Milk[]{milk}, cafeteria.getProducts().toArray());
        assertEquals(milk, cafeteria.getProducts().get(0));
        assertEquals(1, cafeteria.getProducts().size());
    }

    @Test
    void clearCafeteria(){
        setup();
        cafeteria.clearCafeteria();
        assertEquals(0, cafeteria.getProducts().size());
    }
}