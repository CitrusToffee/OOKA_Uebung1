package org.bonn.ooka.buchungssystem.ss2022.Komponente;

import org.bonn.ooka.buchungssystem.ss2022.Cache;
import org.bonn.ooka.buchungssystem.ss2022.Caching;

import java.util.ArrayList;
import java.util.List;

public class ProxyCache implements Caching {

    Cache cache = new Cache();

    public void cacheResult(String key, List<Object> value){
        cache.cacheResult(key,value);
    }

    public List<Object> getResult(String key){
        List<Object> list;
        try {
            list = cache.getResult(key);
        } catch (RuntimeException e) {
            System.out.println("Der Key " + key + " ist nicht vorhanden!");
            list = new ArrayList<>();
        }
        return list;
    }
}
