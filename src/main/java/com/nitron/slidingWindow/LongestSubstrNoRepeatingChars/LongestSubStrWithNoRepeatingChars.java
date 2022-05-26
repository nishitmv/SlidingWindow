package com.nitron.slidingWindow.LongestSubstrNoRepeatingChars;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithNoRepeatingChars {
    public int calc(String str) {

        int n = str.length();
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        int i = 0;
        int j = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (j < n) {
            while (j < n) {
                char key = str.charAt(j);
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                    result = Math.max(result, map.size());
                    j++;
                } else {
                    map.compute(key, (k, v) -> v + 1);
                    j++;
                    break;
                }
            }

            while (i < n) {
                char keyAti = str.charAt(i);
                if (map.get(keyAti) == 1) {
                    map.remove(keyAti);
                    i++;
                } else if (map.get(keyAti) > 1) {
                    map.compute(keyAti, (k, v) -> v - 1);
                    i++;
                    break;
                }
            }
        }

        return result;
    }
}
