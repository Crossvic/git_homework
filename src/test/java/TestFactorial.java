import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestFactorial {

    @Test
    void factorial() {
        assertEquals(1, FindFactorial.factorial(0));
        assertEquals(1, FindFactorial.factorial(1));
        assertEquals(120, FindFactorial.factorial(5));
    }

    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> FindFactorial.factorial(-1));
        assertEquals("Вы ввели отрицательное число", exception.getMessage());
        }
    }
