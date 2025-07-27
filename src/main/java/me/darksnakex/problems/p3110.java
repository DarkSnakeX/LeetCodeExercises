package me.darksnakex.problems;

public class p3110 {

    public int scoreOfString(String s) {
        int res = 0;
        int anterior = 0;

        char[] charArray = s.toCharArray();

        for(char car: charArray){
            if(anterior != 0) {
                res += Math.abs(car - anterior);
            }
            anterior = car;
        }

        return res;
    }
}
