package com.company.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsConcatenateStringsTest {

    @Test
    public void successfulConcatenation(){
        Utils utils = new Utils();
        assertEquals("ab", utils.concatenateStrings("a", "b"));
    }

    @Test
    public void concatenationWithEmptyStringShouldReturnSameString(){

        Utils utils = new Utils();
        assertEquals("a", utils.concatenateStrings("a", ""));
    }

    @Test
    public void concatenationShouldBeCompatibleWithNonLatinSymbols(){
        Utils utils = new Utils();
        assertEquals("\u2345\u1234", utils.concatenateStrings("\u2345", "\u1234"));
    }

    @Test
    public void concatenationShouldThrowExceptionIfOneOfTheStringsIsNull(){
        Utils utils = new Utils();
        assertThrows(IllegalArgumentException.class, () -> utils.concatenateStrings(null, "b"));
        assertThrows(IllegalArgumentException.class, () -> utils.concatenateStrings("b", null));
    }

}
