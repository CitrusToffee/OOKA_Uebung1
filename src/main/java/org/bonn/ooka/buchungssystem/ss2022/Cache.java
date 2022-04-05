package org.bonn.ooka.buchungssystem.ss2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache implements Caching{

    Map<String,List<Object>> save = new HashMap<>();


    public void cacheResult(String key, List<Object> value){
        System.out.println("Caching");
        save.put(key,value);
    }

    public List<Object> getResult(String key){
        if (save.containsKey(key)){
            return save.get(key);
        }else{
            throw new RuntimeException("Key ist nicht in der Map gespeichert");
        }
    }



}
