package me.darksnakex.problems.java;

import java.util.HashMap;
import java.util.Map;

public class p3541 {

    public int maxFreqSum(String s) {

        Map<Character,Integer> mapvocal =  new HashMap<>();
        Map<Character, Integer> mapconsonante = new HashMap<>();

        for(char car: s.toCharArray()){
            if(car == 'a' || car == 'i' || car == 'o' || car == 'e' || car == 'u'){
                if(!mapvocal.containsKey(car)){
                    mapvocal.put(car,1);
                }else{
                    mapvocal.put(car, mapvocal.get(car)+1);
                }
            }else {
                if(!mapconsonante.containsKey(car)){
                    mapconsonante.put(car,1);
                }else{
                    mapconsonante.put(car, mapconsonante.get(car)+1);
                }
            }
        }
        int max = 0;
        int max2 = 0;
        for(char car: mapvocal.keySet()){
            if(mapvocal.get(car) > max){
                max = mapvocal.get(car);
            }
        }


        for(char car: mapconsonante.keySet()){
            if(mapconsonante.get(car) > max2){
                max2 = mapconsonante.get(car);
            }
        }

        return max+max2;
    }

}
