import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addNumbers() {
        System.out.println("Testing adding 2 numbers");
        int actual = new Calculator().addNumbers(1,2);
        int expected = 3;
        assertEquals(expected, actual);
        System.out.println("The right result is " + actual);
    }
}