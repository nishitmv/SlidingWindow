package com.nitron.slidingWindow.CountAnagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountAnagramsinStringOptimized {
    public int countAnagrams(String str, String pattern) {

        int n = str.length();
        int k = pattern.length();
        char[] subStr = new char[k];
        String tmp = "";
        char[] input = str.toCharArray();
        Map<Character, Integer> map = buildCharCountMap(pattern);
        int count = 0;
        for (int i = 0; i < n; ) {

            Map<Character, Integer> tmpMap = new HashMap<>(map);

            if (i == 0) {
                int j = 0;
                while (j < k) {
                    subStr[j] = input[j];
                    if (tmpMap.containsKey(input[j])) {
                        tmpMap.put(input[j], (tmpMap.get(input[j]) - 1));
                    }
                    j++;
                    i++;
                }
                tmp = String.valueOf(subStr);
            } else {
                StringBuilder builder = new StringBuilder();
                tmp = builder.append(tmp.substring(1)).append(input[i]).toString();
                for (int j = 0; j < k; j++) {
                    if (tmpMap.containsKey(tmp.charAt(j))) {
                        tmpMap.put(tmp.charAt(j), (tmpMap.get(tmp.charAt(j)) - 1));
                    } else break;
                }
                i++;
            }
            boolean flag = true;
            for (char key : tmpMap.keySet()) {
                if (tmpMap.get(key) != 0) {
                    flag = false;
                    break;
                }

            }
            if (flag)
                count++;
        }

        return count;
    }

    private Map<Character, Integer> buildCharCountMap(String pattern) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : pattern.toCharArray()) {
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        return map;
    }
}
