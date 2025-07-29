package me.darksnakex.problems;

public class p3190 {


    public int minimumOperations(int[] nums) {

        int res = 0;

        for (int num : nums) {
            int resto = num % 3;
            if (!(resto == 0)) {
                res++;
            }
        }

        return res;

    }

}
