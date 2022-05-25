package com.nitron.slidingWindow.LongestSubStrKUniqueChars;

import java.util.HashMap;
import java.util.Map;

public class CalcLongestSubStrKUniqChars {

    public int calc(String str, int k) {

        if (k > str.length())
            return -1;

        int n = str.length();
        int i = 0;
        int j = 0;
        int result = -1;
        Map<Character, Integer> map = new HashMap<>();
        while (j < n) {

            while (map.size() > k) {
                char keyAtI = str.charAt(i);
                if (map.get(keyAtI) > 1)
                    map.put(keyAtI, map.get(keyAtI) - 1);
                else
                    map.remove(keyAtI);
                i++;
            }

            while(map.size()<=k && j<n) {
                char key = str.charAt(j);
                if (map.containsKey(key))
                    map.put(key, map.get(key) + 1);
                else
                    map.put(key, 1);

                if (map.size() == k) {
                    result = Math.max(result, j - i + 1);
                }
                j++;
            }

        }
        return result;
    }
}
