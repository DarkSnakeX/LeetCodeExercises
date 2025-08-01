package me.darksnakex.problems;

public class p2413 {

    public int smallestEvenMultiple(int n) {

        for(double i = 2; i<n*10; i++){
            if(i % 2 == 0 && (i/n)%1 == 0){
                return (int)i;
            }
        }
        return n;

    }

}
