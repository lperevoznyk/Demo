package calculator;

import calculatordemo.Calculator;
import org.junit.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        Assert.assertEquals(4, calculator.calculate("2 + 2"));
        Assert.assertEquals(60, calculator.calculate("20 + 40"));
        Assert.assertEquals(600, calculator.calculate("200 + 400"));
        Assert.assertEquals(600, calculator.calculate("200         +  400"));
        Assert.assertEquals(600, calculator.calculate("200+400"));
    }

    @Test
    public void testMinus() {
        Assert.assertEquals(2, calculator.calculate("4 - 2"));
        Assert.assertEquals(2, calculator.calculate("40 - 20"));
    }

}