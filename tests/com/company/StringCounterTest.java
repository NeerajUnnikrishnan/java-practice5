package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class StringCounterTest {

    StringCounter counter;

    @Before
    public void setUp() throws Exception {

        counter  = new StringCounter();

    }

    @After
    public void tearDown() throws Exception {

        counter = null;

    }

    @Test
    public void countString() {

        String testString = "one one -one___two,,three,one @three*one?two";

        assertEquals(4,counter.countString(testString,"one"));

    }
}