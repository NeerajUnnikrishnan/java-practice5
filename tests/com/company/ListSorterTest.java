package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListSorterTest {

    ListSorter sorter;

    @Before
    public void setUp() throws Exception {

        sorter = new ListSorter();

    }

    @After
    public void tearDown() throws Exception {

        sorter = null;

    }

    @Test
    public void sorter() {

        String[] testArray = {"Bikas", "Raman","Jadav", "Anand"};

        assertEquals("Anand", sorter.sort(testArray));
    }
}