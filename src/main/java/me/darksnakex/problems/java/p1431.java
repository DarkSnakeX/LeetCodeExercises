package me.darksnakex.problems.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();

        for(int i = 0; i <candies.length; i++){
            int[] cop = Arrays.copyOf(candies,candies.length);
            cop[i]+=extraCandies;
            if(eselMayor(cop,i) == i){
                res.add(true);
            }else{
                res.add(false);
            }


        }


        return res;
    }

    private int eselMayor(int[] cancop, int nino) {
        int actual = cancop[nino];
        int max = nino;
        for (int i = 0; i < cancop.length; i++){
            if (actual < cancop[i]){
                max = i;
                actual = cancop[i];
            }
        }
        return max;
    }
}
