package org.bonn.ooka.buchungssystem.ss2022;

import java.util.List;

public interface Caching {
    public void cacheResult(String key, List<Object> value);
    public List<Object> getResult(String key);
}
