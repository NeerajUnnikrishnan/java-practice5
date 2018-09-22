package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringDoubleCounterTest {

    StringDoubleCounter counter;

    @Before
    public void setUp() throws Exception {

        counter = new StringDoubleCounter();

    }

    @After
    public void tearDown() throws Exception {

        counter = null;

    }

    @Test
    public void countDouble() {

        String[] testString = {"a", "b", "a", "s", "c", "c", "c"};
        assertTrue(counter.countDouble(testString));

    }
}