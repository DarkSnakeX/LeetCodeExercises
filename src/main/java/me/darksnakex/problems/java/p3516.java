package me.darksnakex.problems.java;

public class p3516 {

    public int findClosest(int x, int y, int z) {
        int calc = Math.abs(x-z);
        int calc2 = Math.abs(y-z);

        if(calc == calc2) return 0;
        if(calc < calc2) return 1;
        return 2;

    }

}
