package com.company;
import java.util.*;


public class StringCounter{
    public static int countString(String inputString, String word) {

        Map<String, Integer> countMap = new HashMap<>();

        String[] stringArray = inputString.split("\\W+");

        int count=0;
        for(int i=0;i<stringArray.length;i++){
            if(stringArray[i].equals(word)){
                count++;

            }
            System.out.println(stringArray[i]);
        }
        countMap.put(word,count);
        return countMap.get(word);
    }
}