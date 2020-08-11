import java.util.HashMap;
import java.util.Map;

// Given an array of non-empty strings,
// return a Map<String, String> with a key for every different first character seen,
// with the value of all the strings starting with that character appended together in the order they appear in the array.

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String lead = str.substring(0, 1);
            if (!map.containsKey(str.substring(0, 1))) {
                map.put(lead, str);
            }
            else if (map.containsKey(str.substring(0, 1))) {
                map.put(lead, map.get(lead) + str);
            }
        }
        return map;
    }
}
