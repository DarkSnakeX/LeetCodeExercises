package me.darksnakex.problems.java;

public class p326 {

    public boolean isPowerOfThree(int n) {

        if(n == 0){
            return false;
        }

        double res;
        int res2;

        res = (double) n /3;
        res2 = n/3;

        return res == res2;

    }

}
