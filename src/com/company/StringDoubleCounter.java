package com.company;
import java.util.*;

public class StringDoubleCounter {

    public static boolean countDouble(String[] stringArray){

        Map<String, Boolean> map = new HashMap<String, Boolean>();

        Set<String> hash_Set = new HashSet<String>();

        for (String s : stringArray) {
            hash_Set.add(s);
        }

        Iterator<String> itr = hash_Set.iterator();

        while (itr.hasNext()) {

            int count=0;
            String key = itr.next();
            for(String s:stringArray){
                if(key.equals(s)){
                    count++;
                }
            }

            if(count>=2){
                map.put(key,true);
            }

        }

        return map.get(stringArray[0]);
    }
}
