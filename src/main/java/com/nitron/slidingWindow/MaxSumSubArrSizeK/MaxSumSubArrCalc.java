package com.nitron.slidingWindow.MaxSumSubArrSizeK;

public class MaxSumSubArrCalc {
    public int calcMaxSumSubArray(int[] arr, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; ) {

            if (i == 0) {
                int count = k;
                while (count > 0) {
                    sum += arr[i];
                    i++;
                    count--;
                }
            } else {

                sum -= arr[i - k];
                sum += arr[i];
                i++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}
