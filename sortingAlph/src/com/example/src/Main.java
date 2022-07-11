package com.example.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        String[] names = {"Manuela", "Ludovico", "Piero", "Sandro", "Daniele",
                "Enio", "Tommaso", "Valeria", "Walter", "Samuele"};

        for(int i = 0; i < names.length; i++)
        {
            for(int j = i+1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) <= 0) {

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        //this might get a code smell. But to avoid the problem you can comment this line so there are 0 code smells
        System.out.println("Array after sorting: "+Arrays.toString(names));
    }
}