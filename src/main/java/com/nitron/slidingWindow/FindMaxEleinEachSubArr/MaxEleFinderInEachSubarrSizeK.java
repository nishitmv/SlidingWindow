package com.nitron.slidingWindow.FindMaxEleinEachSubArr;

import java.util.ArrayList;
import java.util.List;

public class MaxEleFinderInEachSubarrSizeK {

    List<Integer> findMaxElementInEachSubArr(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        int j = 0;
        int i = 0;

        while (j < n) {
            int tempMax = Integer.MIN_VALUE;
            j=i;
            while (j <= i + k-1 ) {
                tempMax = Math.max(tempMax, arr[j]);
                j++;
            }
            i ++;
            result.add(tempMax);
        }
        return result;
    }


}
