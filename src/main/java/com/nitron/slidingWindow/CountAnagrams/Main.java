package com.nitron.slidingWindow.CountAnagrams;

public class Main {

    public static void main(String[] args) {

        String str = "rtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkas";
        String pattern = "vwsrenzk";

        System.out.println(new CountAnagramsinStringOptimized().countAnagrams(str, pattern));

    }
}
