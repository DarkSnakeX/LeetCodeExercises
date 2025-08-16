package me.darksnakex.problems.java;

import java.util.Arrays;

public class p2574 {

    public int[] leftRightDifference(int[] nums) {

        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] res = new int[nums.length];


        int acumulado = 0;
        int j = 1;
        for(int i = 0; i < nums.length; i++){

            if(i != 0) {
                leftsum[j] = acumulado;
                j++;
            }
            acumulado+= nums[i];
        }

        System.out.println(Arrays.toString(leftsum));

        acumulado = 0;
        j = nums.length-2;
        for(int i = nums.length-1; i >= 0; i--){
            if(i != nums.length-1) {
                rightsum[j] = acumulado;
                j--;
            }
            acumulado+= nums[i];
        }

        System.out.println(Arrays.toString(rightsum));

        for (int i = 0; i < nums.length; i++){
            res[i] = Math.abs(leftsum[i]-rightsum[i]);
        }



        return res;

    }

}
