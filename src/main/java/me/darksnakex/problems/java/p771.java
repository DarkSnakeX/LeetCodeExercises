package me.darksnakex.problems.java;

public class p771 {

    public int numJewelsInStones(String jewels, String stones) {

        int res = 0;

        for(int i = 0; i <jewels.length(); i++){
            char carac = jewels.charAt(i);
            for(int j = 0; j < stones.length(); j++){
                if(stones.charAt(j) == carac){
                    res++;
                }

            }

        }


        return res;

    }


}
