package mephi.Lab6.ex03;

import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;

public class Table<K,V> {

    private static class Entry<K,V>{

        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public V getValue() {
            return this.value;
        }

        public K getKey(){
            return this.key;
        }

        @Override
        public String toString() {
            return "Entry key: " + key + "-> value: " + value ;
        }


    }
    private ArrayList<Entry<K,V>> entries;


    Table(){
        entries=new ArrayList<>();
    }

    public V getValue(K key){
        for (int i = 0; i< entries.size(); i++){
            if(entries.get(i).getKey()==key)
                return entries.get(i).getValue();
        }
        throw new NoSuchKeyException("No such key in the table");
    }

    public void setValue(K key,V value) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                entries.get(i).setValue(value);
                return;
            }
        }
        entries.add(new Entry(key, value));
    }
    public void removeValue(K key){
        for (int i = 0; i< entries.size(); i++){
            if(entries.get(i).getKey()==key) {
                entries.remove(i);
                return;
            }
        }
        throw new NoSuchKeyException("No such key in the table");
    }

}
