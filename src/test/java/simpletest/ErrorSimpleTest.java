package simpletest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("simple")
public class ErrorSimpleTest {

    @Test
    @DisplayName("2 == 2")
    void firstTest(){
        assertEquals(2, 3);
    }

    @Test
    @DisplayName("2 > 1")
    void secondTest(){
        assertEquals(true, 2 > 3);
    }

    @Test
    @DisplayName("3 > 2")
    void thirdTest(){
        assertEquals(true, 3 > 6);
    }

    @Test
    @DisplayName("1 < 2")
    void fourthTest(){
        assertEquals(true, 3 < 2);
    }

    @Test
    @DisplayName("6 == 6")
    void fifthTest(){
        assertEquals(6, 3);
    }
}
