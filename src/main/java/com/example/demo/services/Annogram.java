package com.example.demo.services;

import java.util.*;

public class Annogram {

        public static void main (String[] args) {
            List<String> anagrams = List.of("Race", "NIghT", "Angle", "CaRe", "angel", "ThiNG", "angel", "angel");
//   Race, NIghT, Angle или CaRe, angel, ThiNG
            System.out.println(removeAnagrams(anagrams));
        }


        public static List<String> removeAnagrams(List<String> anagrams){
            List<String> list = new ArrayList<>();
            for (int i = 0; i < anagrams.size() -1; i++){
                for(int j = i+1; j < anagrams.size(); j++){
                    StringBuilder stringBuilderI = new StringBuilder();
                    stringBuilderI.append(anagrams.get(i));
                    StringBuilder stringBuilderJ = new StringBuilder();
                    stringBuilderJ.append(anagrams.get(j));
                    if(!stringBuilderI.toString().equalsIgnoreCase(stringBuilderJ.toString()) ||
                            !stringBuilderI.reverse().toString().equalsIgnoreCase(stringBuilderJ.toString())){
                        if(!list.contains(stringBuilderJ.toString())){
                            list.add(stringBuilderJ.toString());
                        } else if (!list.contains(stringBuilderI.toString())) {
                            list.add(stringBuilderI.reverse().toString());
                        }
                    }
                    stringBuilderJ.delete(0, stringBuilderJ.length());
                    stringBuilderI.delete(0, stringBuilderI.length());
                }
            }
            return list;
        }
    }
