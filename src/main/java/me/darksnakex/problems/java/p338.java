package me.darksnakex.problems.java;

public class p338 {

    public int[] countBits(int n) {
        int[] res = new int[n+1];

        for(int i = n; i>0; i--){
            res[i]=Integer.bitCount(n);
            n--;
        }


        return res;
    }

}
