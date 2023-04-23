package TestingPlaygroud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTests {

    @Test
    void BasicTest(){
        assertEquals(2 + 2, 4);
    }

    @Test
    void testExpected(){
        Assertions.assertEquals(Integer.parseInt("1"), 1);
    }

    @Test
    void testExpectedException() {
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        }, "NumberFormatException was expected");

        Assertions.assertEquals("For input string: \"One\"", thrown.getMessage());
    }

    int absoluteValue(int num){
        if(num >= 0) {
            return num;
        }
        return -num;
    }

    @Test
    void TestabsoluteValuePositive(){
        assertEquals(absoluteValue(3), 3);
    }
    @Test
    void TestabsoluteValueNegative(){
        assertEquals(absoluteValue(-3), 3);
    }
}
