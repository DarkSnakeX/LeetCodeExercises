package me.darksnakex.problems.java;

import java.util.HashSet;
import java.util.Set;

public class p357 {

    public int countNumbersWithUniqueDigits(int n) {

        int res = 0;
        int max = (int) Math.pow(10,n);

        for(int i = 0; i < max; i++){
            if(!estaRepetido(Integer.toString(i))){
                res++;
            }
        }

        return res;

    }

    private boolean estaRepetido(String string) {
        if (string.length() <= 1) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (char car : string.toCharArray()) {

            if (!set.add(car)) {
                return true;
            }
        }

        return false;
    }

}
