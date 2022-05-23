package com.nitron.slidingWindow.MaxSumSubArrSizeK;

public class Main {


    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};

        int k = 3;

        System.out.println(new MaxSumSubArrCalc().calcMaxSumSubArray(arr, k));

    }

}
