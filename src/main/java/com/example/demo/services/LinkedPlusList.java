package com.example.demo.services;

import java.util.LinkedList;
import java.util.List;

public class LinkedPlusList {

    public LinkedList<Integer> addTwo(List<Integer> l1, List<Integer> l2) {

        if (l1.size() < l2.size()) {
            int count = l2.size() - l1.size();
            for (int i = 0; i < count; i++) {
                l1.add(0);
            }

        } else if (l1.size() > l2.size()) {
            int count = l1.size() - l2.size();
            for (int i = 0; i < count; i++) {
                l2.add(0);
            }
        }
        return calculation(l1,l2);
    }
    private LinkedList<Integer> calculation(List<Integer> l1, List<Integer> l2){
        LinkedList<Integer> result = new LinkedList<>();

        int shor = 0;
        for (int i = 0; i < l2.size(); i++) {
            int temp = l1.get(i) + l2.get(i) + shor;
            shor = 0;
            if (temp < 10) {
                result.add(temp);
            } else if (i == l2.size() - 1) {
                int one = temp / 10;
                int two = temp % 10;
                result.add(two);
                result.add(one);
            } else {
                result.add(temp - 10);
                shor = 1;
            }
        }
        return result;
    }
}
