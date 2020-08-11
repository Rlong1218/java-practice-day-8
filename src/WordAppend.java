import java.util.HashMap;
import java.util.Map;

// Loop over the given array of strings to build a result string like this:
// when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
// Return the empty string if no string appears a 2nd time.

public class WordAppend {
    public String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if(!map.containsKey(str)) {
                map.put(str, 1);
            }
            else if (map.containsKey(str)) {
                map.put(str, map.get(str) +1);
                if (map.get(str)%2 == 0) {
                    result.append(str);
                }
            }
        }
        return result.toString();
    }
}
