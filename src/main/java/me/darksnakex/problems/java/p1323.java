package me.darksnakex.problems.java;


public class p1323 {

    public int maximum69Number (int num) {

        char[] arr = Integer.toString(num).toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }

        int res = 0;
        int pow = 0;
        for(int i = arr.length-1; i>= 0; i--){
            res+= (int)(Math.pow(10,pow))*(arr[i]-48);
            pow++;
        }

        return res;
    }

}
