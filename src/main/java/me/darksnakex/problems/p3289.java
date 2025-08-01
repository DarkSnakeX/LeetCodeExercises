package me.darksnakex.problems;

import java.util.HashMap;
import java.util.Map;

public class p3289 {

    public int[] getSneakyNumbers(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        int val1=-1;
        int val2=-1;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }

        }
        for (int valor : map.keySet()) {
            if((map.get(valor))== 2){
                if(val1 == -1){
                    val1 = valor;
                } else if (val2 == -1) {
                    val2 =  valor;
                }
                else{
                    break;
                }
            }

        }

        return new int[]{val1,val2};

    }

}
