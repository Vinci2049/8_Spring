import java.util.HashMap;
import java.util.Map;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
When a position in the array has been swapped, it no longer matches anything. Using a map,
this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

public class Map_2 {

    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (strings[i].length() > 0) {
                String firstSymbol = strings[i].substring(0, 1);

                if (map.containsKey(firstSymbol)) {

                    int index = map.get(firstSymbol);
                    String buffer = strings[i];
                    strings[i] = strings[index];
                    strings[index] = buffer;

                    map.remove(firstSymbol);

                } else {
                    map.put(firstSymbol, i);
                }
            }
        }
        return strings;
    }


    /*
    Given an array of non-empty strings, create and return a Map<String, String> as follows:
    for each string add its first character as a key with its last character as the value.

    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    pairs(["man", "moon", "main"]) → {"m": "n"}
    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */

    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();
        for (String currentString : strings) {
            map.put(currentString.substring(0, 1), currentString.substring(currentString.length() - 1));
        }
        return map;
    }

}
