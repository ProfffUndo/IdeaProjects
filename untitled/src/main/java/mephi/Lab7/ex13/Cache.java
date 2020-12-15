package mephi.Lab7.ex13;

import java.util.LinkedHashMap;

public class Cache<K,V> extends LinkedHashMap<K,V> {
     private int cacheSize;
     public Cache(int n){
         super();
         cacheSize=n;
     }
Iterable
    @Override
    public V put(K key, V value) {
        V result = null;
         if (keySet().contains(key)) {
            result = get(key);
        }
         if(size()<cacheSize) super.put(key, value);
        else throw new CacheIsFullException("Cache is full");
        return result;
    }
}
