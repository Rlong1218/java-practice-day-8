import java.util.HashMap;
import java.util.Map;

// The classic word-count algorithm:
// given an array of strings, return a Map<String, Integer> with a key for each different string,
// with the value the number of times that string appears in the array.

public class WordCount {
    private Object HashMap;

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            }
            else if (map.containsKey(str)) {
                map.put(str, map.get(str) +1);
            }
        }
        return map;
    }
}
