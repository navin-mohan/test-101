import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testAdd() {
        HelloWorld hw = new HelloWorld();
        int result = hw.add(1, 2);
        int expected = 3;
        assertEquals(expected, result, "The add method should add two numbers together");
    }
}
