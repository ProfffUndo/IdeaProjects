package mephi.Lab7.ex13;

import java.util.LinkedHashMap;

public class Cache<K,V> extends LinkedHashMap<K,V> {
     private int cacheSize;
     public Cache(int n){
         super();
         cacheSize=n;
     }
}
