package example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void divideXByY() {
        Divide d = new Divide();
        assertEquals(0.5, d.divideXByY(1, 3), 0.1);
    }
}