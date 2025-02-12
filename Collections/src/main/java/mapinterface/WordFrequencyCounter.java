package mapinterface;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println(countWords(text));

    }
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        if (text.length()==0){
            return wordCount;
        }

            text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

            String[] words = text.split("\\s+");

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            return wordCount;
        }



}
