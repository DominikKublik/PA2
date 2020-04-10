import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShovelTest {

    Shovel shovel = new Shovel("TestShovel", 1, Material.STEEL, Size.SMALL);


    @RepeatedTest(1000)
    void checkIfStolen() {
        assertTrue(shovel.checkIfStolen(0));
        assertFalse(shovel.checkIfStolen(100));
    }

}