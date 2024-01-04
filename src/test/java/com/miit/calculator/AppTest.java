package com.miit.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    calc calc1 = new calc();
 
    @Test
    public void testAddition() {
        assertEquals(10.0, calc1.add(6.0, 4.0), 0.1);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, calc1.sub(6.0, 4.0), 0.1);
    }

    @Test
    public void testMultiplication() {
        assertEquals(24.0, calc1.multiply(6.0, 4.0), 0.1);
    }

    @Test
    public void testDivision() {
        assertEquals(1.5, calc1.divide(6.0, 4.0), 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calc1.divide(5.0, 0.0);
    }
}
