package me.darksnakex.problems.java;

public class p171 {

    public int titleToNumber(String columnTitle) {

        int res = 0;
        int temp = 0;
        for(int i = columnTitle.length()-1; i>=0; i--){
            int numac = columnTitle.charAt(temp)-64;
            res+= (int) (numac*Math.pow(26,i));
            temp++;

        }

        return res;
    }

}
