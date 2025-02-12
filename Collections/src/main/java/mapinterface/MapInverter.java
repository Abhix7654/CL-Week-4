package mapinterface;

import java.util.*;

class MapInverter {

    public static void main(String[] args) {

        Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1);
        System.out.println(invertMap(input));

    }
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return invertedMap;
    }


}
