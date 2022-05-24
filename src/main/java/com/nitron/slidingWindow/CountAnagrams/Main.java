package com.nitron.slidingWindow.CountAnagrams;

public class Main {

    public static void main(String[] args) {

        String str = "cbaebabacd";
        String pattern = "abc";

        System.out.println(new CountAnagramsinString().countAnagrams(str, pattern));

        System.out.println(new FindAnagramsinString().findAnagrams(str, pattern));

    }
}
