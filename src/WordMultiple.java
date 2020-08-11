import java.util.HashMap;
import java.util.Map;

// Given an array of strings, return a Map<String, Boolean>
// where each different string is a key and its value is true if that string appears 2 or more times in the array.

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, false);
            }
            else if(map.containsKey(str)) {
                map.put(str, true);
            }
        }
        return map;
    }
}
