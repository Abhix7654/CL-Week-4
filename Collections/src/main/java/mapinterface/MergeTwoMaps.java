package mapinterface;
import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args) {
            Map<String, Integer> map1 = Map.of("A", 1, "B", 2);

            Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

            System.out.println(mergeMaps(map1, map2));
        }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return mergedMap;

    }

}
