package me.darksnakex.problems.java;



public class p2798 {


    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int res = 0;
        for (int hour : hours) {
            if (hour >= target) {
                res++;
            }
        }
        return res;

    }


}
