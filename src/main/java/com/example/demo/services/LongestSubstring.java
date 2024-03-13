package com.example.demo.services;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstring {
    public static void main(String[] args) {
        String na = "pwwkew";
        System.out.println(Solution.lengthOfLongestSubstring(na));
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        List<Integer> list2 = new ArrayList<>();
//        list.add(3);
//        list.add(2);
//        list.add(1);
//
//        Set<List<Integer>> set = new HashSet<>();
//        set.add(list);
//
//        if (set.contains(list)) {
//            for(List<Integer> ls : set){
//                if(ls.equals(list))
//                System.out.println(ls.get(0));
//            }
//        }

    }

    class Solution {
        static public int lengthOfLongestSubstring(String s) {
            int a = 0;
            int b = 0;
            int result = 0;
            HashSet<Character> char_hash = new HashSet<>();

            while (b < s.length()){
                if(!char_hash.contains(s.charAt(b))){
                    char_hash.add(s.charAt(b));
                    b++;
                    result = Math.max(char_hash.size(), result);
                }
                else {
                    char_hash.remove(s.charAt(a));
                    a++;
                }
            }
            return result;
        }
    }
}
