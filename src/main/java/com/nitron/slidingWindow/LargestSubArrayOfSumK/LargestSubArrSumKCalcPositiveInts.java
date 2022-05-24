package com.nitron.slidingWindow.LargestSubArrayOfSumK;

public class LargestSubArrSumKCalcPositiveInts {
    public int calc(int[] arr, int sum) {

        int n = arr.length;
    int i = 0;
    int j = 0;
    int subArrSize = 0;
    int tmpSum = 0;
        while (j < n) {
            while(tmpSum>=sum && i<j) {
                tmpSum = tmpSum - arr[i];
                i++;
            }
        while (tmpSum < sum && j<n) {
            tmpSum += arr[j];
            j++;
        }

        if (tmpSum == sum)
            subArrSize = Math.max(subArrSize, j - i);


    }
        return subArrSize;
}
}
