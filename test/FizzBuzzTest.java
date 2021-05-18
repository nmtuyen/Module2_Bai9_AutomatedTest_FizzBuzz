import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz() {
        int number = 53;
        String hope = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(53);
        assertEquals(hope, result);
    }
}