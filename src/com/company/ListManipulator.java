package com.company;
import java.util.*;

public class ListManipulator {

    public static List<String> updateList(List<String> inputList, String newElement, String oldElement) {


        int index = inputList.indexOf(oldElement);

       return inputList;

    }

    public static List<String> clearList(List<String> inputList){

        inputList.clear();

        return inputList;
    }
}