package com.tyit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculater c = new Calculater();
        assertEquals(10, c.add(5, 5));
    }
}


