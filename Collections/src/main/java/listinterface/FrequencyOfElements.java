package listinterface;
import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Abhishek","Palak","Naincy","Abhishek","Rahul","Palak","Palak");
        System.out.println(countFrequency(list));

    }
    public static LinkedHashMap<String, Integer> countFrequency(List<String> list) {
        LinkedHashMap<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }
}
