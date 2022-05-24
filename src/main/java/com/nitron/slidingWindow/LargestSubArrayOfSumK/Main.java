package com.nitron.slidingWindow.LargestSubArrayOfSumK;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 1, 2, 3, 5};

        int sum = 5;

        System.out.println(new LargestSubArrSumKCalcPositiveInts().calc(arr, sum));


    }

}
