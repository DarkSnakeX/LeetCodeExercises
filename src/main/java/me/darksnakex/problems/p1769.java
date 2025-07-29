package me.darksnakex.problems;

public class p1769 {

    public int[] minOperations(String boxes) {


        int[] res = new int[boxes.length()];

        for(int i = 0; i < boxes.length(); i++){
            if(boxes.charAt(i) == '1') {
                for (int j = 0; j < boxes.length(); j++) {
                    res[j] += Math.abs(i - j);
                }
            }
        }


        return res;

    }
}
