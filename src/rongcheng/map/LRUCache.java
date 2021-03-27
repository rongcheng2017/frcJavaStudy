package rongcheng.map;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache<K, V> implements Iterable<K> {

    int MAX =3;

    LinkedHashMap<K, V> cache = new LinkedHashMap<>();


    public void cache(K key,V value){

    }

    @Override
    public Iterator<K> iterator() {
        return null;
    }


}
