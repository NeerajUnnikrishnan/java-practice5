package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListManipulatorTest {

    List<String> testList = new ArrayList<>(Arrays.asList("deer", "lion", "dog","cat"));

    ListManipulator manipulator;

    @Before
    public void setUp() throws Exception {

        manipulator = new ListManipulator();

    }

    @After
    public void tearDown() throws Exception {

        manipulator = null;

    }

    @Test
    public void updateList() {

        assertEquals("deer", manipulator.updateList(testList, "deer", "cow").get(0));

    }

    @Test
    public void clearList() {

        assertTrue(manipulator.clearList(testList).isEmpty());

    }
}