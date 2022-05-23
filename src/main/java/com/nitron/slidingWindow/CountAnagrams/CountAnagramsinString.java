package com.nitron.slidingWindow.CountAnagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountAnagramsinString {
    public int countAnagrams(String str, String pattern) {

        int n = str.length();
        int k = pattern.length();
        char[] subStr = new char[k];
        StringBuilder tmp = new StringBuilder();
        char[] input = str.toCharArray();
        Map<Character, Integer> map = buildCharCountMap(pattern);
        int count = 0;
        for (int i = 0; i < n; ) {

            if (i == 0) {
                int j = 0;
                while (j < k) {
                    subStr[j] = input[j];
                    j++;
                    i++;
                }
                tmp = new StringBuilder(String.valueOf(subStr));
            } else {
                StringBuilder builder = new StringBuilder();
                tmp = builder.append(tmp.substring(1)).append(input[i]);
                i++;
            }

            if (isAnagram(tmp, map)) count++;
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

    private boolean isAnagram(StringBuilder tmp, Map<Character, Integer> patternMap) {

        Map<Character, Integer> tmpMap = buildCharCountMap(tmp.toString());

        for(Character ch : tmpMap.keySet())
        {
            if(!patternMap.containsKey(ch) ||  (!Objects.equals(patternMap.get(ch), tmpMap.get(ch))))
                return false;
        }
    return true;
    }
}
