package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestKalkulator {

    @Test
    void calculator() {
        Kalkulator kalkulator = new Kalkulator();
        Assertions.assertEquals(5,kalkulator.calculator(2,3));
    }

    @Test
    void calculatorTwo() {
        Kalkulator kalkulator = new Kalkulator();
        Assertions.assertEquals(10,kalkulator.calculator(5,5));
    }
}