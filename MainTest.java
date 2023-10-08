package Three.HomeWork3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void checkEvenNumber() {
        assertTrue(Main.evenOddNumber(8));
    }

    @Test
    void checkOddNumber() {
        assertFalse(Main.evenOddNumber(11));
    }

    @Test
    void checkNumberInInterval() {
        assertTrue(Main.numberInInterval(25));
        assertTrue(Main.numberInInterval(100));
    }

    @Test
    void checkNumberNotInInterval() {
        assertFalse(Main.numberInInterval(24));
        assertFalse(Main.numberInInterval(101));
    }
}
