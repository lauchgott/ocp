package wbs.maps;

import java.util.*;
import java.util.function.Predicate;

public class MapUtil {
    public static <K, V> Map<V, Collection<K>> invertMap(Map<K, V> map) {
        Map<V, Collection<K>> inverted =
                new HashMap<V, Collection<K>>();
        Collection<K> keyCollection;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!inverted.containsKey(entry.getValue())) {
                keyCollection = new ArrayList<>();
                inverted.put(entry.getValue(), keyCollection);
            } else {
                keyCollection = inverted.get(entry.getValue());
            }
            keyCollection.add(entry.getKey());

        }
        System.out.println("\n");
        return inverted;
    }

    public static <K, V> NavigableMap<V, NavigableSet<K>> invertMap(Map<K, V> map,
                                                                    Comparator<? super K> cmpKey, Comparator<? super V> cmpValue) {
        NavigableMap<V, NavigableSet<K>> inverted = new TreeMap<V, NavigableSet<K>>(cmpValue);
        map.forEach((k, v) -> {
            NavigableSet<K> keyCollection = inverted.get(v);
            if (keyCollection == null) {
                keyCollection = new TreeSet<>(cmpKey);
                inverted.put(v, keyCollection);
            }
            keyCollection.add(k);

        });
        return inverted;
    }





    /*
    Wir überladen die Methode invertMap().
    Die überladene Version stellt sicher, dass alle Keys der invertierten Map
    sortiert sind und ebenso alle values zu einem gegebenen Key.


     */


}