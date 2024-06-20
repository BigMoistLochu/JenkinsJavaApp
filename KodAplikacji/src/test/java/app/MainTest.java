package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void methodCalculateShouldReturnTwo(){
        Main main = new Main();
        Assertions.assertEquals(5,main.calculator(2,3));
    }

}
