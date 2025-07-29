package me.darksnakex.problems;


public class p1929 {

    public int[] getConcatenation(int[] nums) {


        int[] res = new int[nums.length + nums.length];
        int i = 0;
        int j = 0;
        while (j < nums.length + nums.length){
            for (int num : nums) {
                res[i] = num;
                j++;
                i++;
            }

    }
        return res;
    }
}
