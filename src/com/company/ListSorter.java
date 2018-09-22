package com.company;
import java.util.*;

public class ListSorter{
    public static String sort(String[] stringArray) {

        List<String> list = Arrays.asList(stringArray);
        Set<String> set = new TreeSet<String>(list) ;

        Iterator iter = set.iterator();
        return iter.next().toString();
    }
}



