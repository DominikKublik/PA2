import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SizeTest {

    @Test
    void getChanceToSteal() {
        assertEquals(60, Size.SMALL.getChanceToSteal());
    }
}