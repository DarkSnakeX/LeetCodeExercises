package me.darksnakex.problems.java;

public class p1689 {


    public int minPartitions(String n) {

        int actual = -1;

        for(int i = 0; i<n.length(); i++){
            if(actual < n.charAt(i)){
                actual = n.charAt(i);
            }
        }

        for(char car: n.toCharArray()){
            if(actual < car){
                actual = car;
            }

        }

        return actual-48;
    }

    public int minPartitionsold(String n){

        int actual = -1;

        for(int i = 0; i<n.length(); i++){
            if(actual < n.charAt(i)){
                actual = n.charAt(i);
            }
        }

        return actual-48;

    }


}
