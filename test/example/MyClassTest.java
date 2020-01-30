package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    // nominal case
    @Test
    void factorial() {
        assertEquals(2, MyClass.factorial(2), 0.1);
        assertThrows(StackOverflowError.class, ()->{
           MyClass.factorial(-1);
        });
    }

    // nominal case
    @Test
    void percentage() {
        double a = -4;
        double b = 2;
        double result = Math. round ((a/b-1)*1e5)*1e-3;
        assertEquals("Decrease of " + result + "%" , MyClass.percentage(a, b));
    }

    // nominal case
    @Test
    void uppercase() {
        assertEquals("sWaG", MyClass.uppercase("swag"));
    }
}