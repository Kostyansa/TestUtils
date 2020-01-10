package com.company.utils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsComputeFactorialTest {

    @Test
    public void zeroFactorialShouldReturnOne(){
        Utils utils = new Utils();

        assertEquals(1, utils.computeFactorial(0));
    }

    @Test
    public void negativeFactorialShouldNotBeAllowed(){
        final Utils utils = new Utils();

        assertThrows(IllegalArgumentException.class, () -> {utils.computeFactorial(-1);});

    }

    @Test
    public void testFactorialWithTimeout(){
        final Utils utils = new Utils();
        Random random = new Random();
        assertTimeout(Duration.ofMillis(250), () -> {
            utils.computeFactorial(random.nextInt(2500));
        });
    }

    @Test
    @Disabled("TODO Fix later")
    public void factorialOfANumberMoreThanOneShouldNotReturnOne(){
        Utils utils = new Utils();
        assertEquals(1, utils.computeFactorial(1));
    }

}
