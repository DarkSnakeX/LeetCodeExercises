package me.darksnakex.problems.java;

public class p1984 {

    public int minimumDifference(int[] nums, int k) {

        int res = 999999999;

        if(nums.length == 1){
            return 0;
        }

        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < k; j++){
                if(Math.abs(nums[i]-nums[j]) < res){
                    res = Math.abs(nums[i]-nums[j]);
                }
            }

        }

        return res;

    }

}
