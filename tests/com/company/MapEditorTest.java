package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapEditorTest {

    MapEditor editor;

    @Before
    public void setUp() throws Exception {

        editor = new MapEditor();

    }

    @After
    public void tearDown() throws Exception {

        editor = null;

    }

    @Test
    public void editMap() {

        Map<String,String> map  = new HashMap<String, String>();
        map.put("val1","one");
        map.put("val2","two");
        assertEquals("one", editor.editMap(map,"val1","val2").get("val2"));

    }
}