package result;


import java.util.*;

public class Issue1 {
    public static String sortStringByFrequency(String str) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Create a List of Map entries and sort it by value (frequency)
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        
        // Build the final string by appending each character the number of times it appears in the original string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}