import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    public void setup(){
        Cafeteria.getInstance().clearCafeteria();
        Supermarket.getInstance().clearSupermarket();
    }
    @Test
    void main() {
        setup();

        String expectedInOutput = "Usable:\nShovels: 0\nTrucks: 1\nMilks: 1\n";
        String expectedInOutputTwo = "Usable:\nShovels: 1\nTrucks: 1\nMilks: 1\n";
        String expectedInOutputThree = "Usable:\nShovels: 2\nTrucks: 1\nMilks: 1\n";

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String[] args = null;
        Main.main(args);
        String output = outContent.toString();

        assertTrue(
                output.equals(expectedInOutput) ||
                        output.equals(expectedInOutputTwo) ||
                        output.equals(expectedInOutputThree)
        );

    }
}