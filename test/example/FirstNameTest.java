package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNameTest {

    @Test
    void get() {
        // nominal
        FirstName firstName1 = new FirstName("Yoyo");
        assertEquals("Yoyo", firstName1.get());

        // not a real firstname
        FirstName firstName2 = new FirstName("");
        assertFalse(firstName2.getIsFirstName());
    }

    @Test
    void set() {
        // nominal case
        FirstName firstName1 = new FirstName("");
        firstName1.set("Yoyo");
        assertEquals("Yoyo", firstName1.get());

        // not a real firstname
        FirstName firstName2 = new FirstName("");
        assertNull(firstName2.get());
    }
}