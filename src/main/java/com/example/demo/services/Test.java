package com.example.demo.services;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Test {
    public static void main(String[] args) {
//        List<String> str = new ArrayList<>();
//        str.add("anton");
//        str.add("DimA");
//        str.add("lesha");
//
//        var answer = str.stream().map(e-> {
//            if (Character.isLowerCase(e.charAt(0))) {
//                return e.substring(0, 1).toUpperCase() + e.substring(1);
//            }
//            else if(Character.isLowerCase(e.charAt(e.length()-1))) {
//                return e.substring(0, e.length()- 1) + e.substring(e.length() -2).toUpperCase();
//            }
//            return e;
//        }).toList();
//        System.out.println(answer);
//
//        List<Integer> num = Arrays.asList(1,2,3,4,5,6,13,15);
//        List<Integer> odd = num.stream().filter(e-> e % 2 == 0).reduce(Integer::sum).stream().toList();
//        List<Integer> even = num.stream().filter(e-> e % 2 != 0).reduce(Integer::sum).stream().toList();
//        System.out.println(odd);
//        System.out.println(even);
//
//
//        List<Integer> num1 = Arrays.asList(1,2,3,4,5,6,13,15,2,5,6,23,13);
//        var e = num1.stream().distinct().toList();
//        System.out.println(e);
//
//        List<String> str1 = new ArrayList<>();
//        str1.add("anton");
//        str1.add("DimA");
//        str1.add("lesha");
//        str1.add("vasya");
//        str1.add("Lenya");
//        str1.add("Lenya");
//        str1.add("denya");
//
//        var o = str1.stream().filter(w -> Character.isLowerCase(w.charAt(0))).count();
//        System.out.println(o);
//
//        var sorting = str1.stream().sorted((x,y) -> y.compareToIgnoreCase(x)).toList();
//        System.out.println(sorting);
//
//        var max = num1.stream().distinct().max(Comparator.naturalOrder()).get();
//        var min = num1.stream().distinct().min(Comparator.naturalOrder()).get();
//        System.out.println(max);
//        System.out.println(min);
//
//        var first = num1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//        System.out.println(first);
//        System.out.println("--------------------------------------------------------");
//        var second = num1.stream().distinct().sorted().skip(1).findFirst().orElse(null);
//        System.out.println(second);
//
//        long b = 35231;
//        String abc = String.valueOf(b);
//        String[] ab = abc.split("");
//        var an = new ArrayList<>(Arrays.stream(ab).mapToInt(Integer::parseInt).boxed().toList());
//        Collections.reverse(new ArrayList<>(Arrays.stream(ab).mapToInt(Integer::parseInt).boxed().toList()));
//        Integer[] resolve = an.toArray(Integer[]::new);
//        int[] result = Arrays.stream(resolve).mapToInt(t->t).toArray();
//        Arrays.stream(result).forEach(System.out::println);
//        StringBuilder stringBuilder = new StringBuilder();
//
//        new StringBuilder().append(b)
//                .reverse()
//                .chars()
//                .map(Character::getNumericValue)
//                .toArray();
    int result = 31 / 10;
    int result2 = 31 % 10;
        System.out.println(result);
        System.out.println(result2);
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);

        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);

        System.out.println(new LinkedPlusList().addTwo(l1,l2));
    }

}

