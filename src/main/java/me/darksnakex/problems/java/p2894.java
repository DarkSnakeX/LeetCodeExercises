package me.darksnakex.problems.java;

public class p2894 {

    public int differenceOfSums(int n, int m) {
        int res1 = 0;
        int res2 = 0;

        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                res1+=i;
            }else{
                res2+=i;
            }

        }

        return res2-res1;

    }

}
