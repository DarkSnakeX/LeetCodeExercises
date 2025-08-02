package me.darksnakex.problems.java;

public class p1470 {

    public int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];

        int m = 0;
        for(int i = 0; i < arr.length; i+=2){
            arr[i] = nums[m];
            arr[i+1] = nums[n];
            m++;
            n++;
        }

        return arr;
    }


}
