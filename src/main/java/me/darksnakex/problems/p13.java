package me.darksnakex.problems;

import java.util.HashMap;
import java.util.Map;

public class p13 {

    public int romanToInt(String s) {

        int res = 0;

        Map<Character,Integer> map =  new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char actual;
        for(int i = 0; i <s.length()-1; i++){
            actual = s.charAt(i);
            if(map.get(actual) >= map.get(s.charAt(i+1)) ){
                res+=map.get(actual);
            }
            else{
                res-=map.get(actual);
            }
        }


        return res + map.get(s.charAt(s.length() - 1));



    }

}
