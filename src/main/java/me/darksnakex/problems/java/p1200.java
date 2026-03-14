package me.darksnakex.problems.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1200 {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {


        List<List<Integer>> listres =  new ArrayList<>();
        int minact = 999999999;

        Arrays.sort(arr);

        for(int i = 0; i < arr.length-1; i++){

            if(arr[i+1] - arr[i] <= minact){
                if(arr[i+1] - arr[i] < minact){
                    minact = arr[i+1] - arr[i];
                    listres.clear();
                }
                List<Integer> listact = new ArrayList<>();
                listact.add(arr[i]);
                listact.add(arr[i+1]);
                listres.add(listact);


            }

        }



        return listres;
    }


    public static void main(String[] args){

        minimumAbsDifference(new int[]{1,3,6,10,15});

    }

}
