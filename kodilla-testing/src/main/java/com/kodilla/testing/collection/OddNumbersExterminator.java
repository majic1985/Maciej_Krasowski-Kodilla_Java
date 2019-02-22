package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public void exterminate(ArrayList <Integer> numbers){
        Integer even = 0;
        for(int n = 0; n < numbers.size(); n ++){
            even = numbers.get(n);
            if(even % 2 == 0){
                System.out.println(even);
            }
        }
    }
}
