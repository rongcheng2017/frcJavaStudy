package rongcheng.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * 使用LinkedHashMap 实现 LRU
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> implements Iterable<K> {

    int MAX = 4;

    LinkedHashMap<K, V> cache = new LinkedHashMap<>();


    public void cache(K key, V value) {

        if (cache.containsKey(key)) {
            cache.remove(key);
        } else if (cache.size() >= MAX) {
            Iterator<K> iterator = cache.keySet().iterator();
            K first = iterator.next();
            cache.remove(first);
        }
        cache.put(key, value);

    }

    @Override
    public Iterator<K> iterator() {
        Iterator<Map.Entry<K, V>> iterator = cache.entrySet().iterator();
        return new Iterator<K>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public K next() {
                return iterator.next().getKey();
            }
        };
    }

    public static void main(String[] args) {
        var lru = new LRUCache<String, Integer>();
        lru.cache("A", 1);
        lru.cache("B", 2);
        lru.cache("C", 3);
        lru.cache("D", 4);


        lru.cache("C", 10);
        System.out.println(
                "leave <-: " +
                        StreamSupport.stream(lru.spliterator(), false)
                                .map(Objects::toString)
                                .collect(Collectors.joining("<-"))
        );
    }

}
