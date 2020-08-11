import java.util.HashMap;
import java.util.Map;

// We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
// Loop over and then return the given array of non-empty strings as follows:
// if a string matches an earlier string in the array, swap the 2 strings in the array.
// When a position in the array has been swapped, it no longer matches anything.

public class AllSwap {
    public String[] allSwap(String[] strings) {
        String[] swapped = new String[strings.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            String lead = str.substring(0,1);
            if (!map.containsKey(lead)) {
                map.put(lead, i);
                swapped[i] = str;
            }
            else if (map.containsKey(lead)) {
                swapped[i] = swapped[map.get(lead)];
                swapped[map.get(lead)] = str;
                map.remove(lead);
            }
        }
        return swapped;
    }
}
