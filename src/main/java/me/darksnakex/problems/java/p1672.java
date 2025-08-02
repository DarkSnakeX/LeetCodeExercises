package me.darksnakex.problems.java;

public class p1672 {

    public int maximumWealth(int[][] accounts) {

        int actual = 0;
        int max = 0;

        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                actual+=accounts[i][j];
            }
            if(actual > max){
                max = actual;
            }
            actual = 0;
        }



        return max;

    }


}
