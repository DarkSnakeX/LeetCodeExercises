package me.darksnakex.problems;

public class p1512 {

    public int numIdenticalPairs(int[] nums) {

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int actual = nums[i];
            for (int j = 0; j < nums.length; j++){
                if(i < j && actual == nums[j]){
                    res++;
                }
            }
        }


        return res;

    }
}


