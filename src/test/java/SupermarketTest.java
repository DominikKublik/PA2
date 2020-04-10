import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    Supermarket supermarket = Supermarket.getInstance();

    @Test
    void getInstance() {
        assertNotNull(Supermarket.getInstance());
    }

    @BeforeEach
    void setUp(){
        supermarket.clearSupermarket();
        supermarket.generateProducts();
    }

    @Test
    void prepare() {
        supermarket.clearSupermarket();
        supermarket.prepare(10, 8);
        assertEquals(10, Supermarket.getStoreTemperature());
        assertEquals(8, Supermarket.getFashionableNumberOfWheels());
        assertEquals(6, supermarket.getListOfProducts().size());
    }

    @Test
    void makeReportAndPrint() {
        String[] expectedInOutput = {"Usable:", "Milks: ", "Trucks: ", "Shovels: "};
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        supermarket.makeReport();

        for (String s : expectedInOutput) {
            assertTrue(outContent.toString().contains(s));
        }
    }

    @Test
    void clearSupermarket() {
        supermarket.clearSupermarket();
        assertEquals(0, supermarket.getListOfProducts().size());
    }
}