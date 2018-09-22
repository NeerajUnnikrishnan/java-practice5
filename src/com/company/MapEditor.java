package com.company;
import java.util.*;

public class MapEditor{
    public static Map<String,String> editMap(Map map, String val1, String val2) {


        if (map.containsKey(val1)) {

            map.put(val2,map.get(val1));
            map.put(val1,"");

        }

        return map;

    }
}