package me.darksnakex.problems.java;


public class p9 {

    public boolean isPalindrome(int x) {
        String res = Integer.toString(x);
        int j = res.length()-1;
        for(int i = 0; i < res.length()/2; i++){
            if(res.charAt(j) != res.charAt(i)){
                return false;
            }
            j--;
        }
        return true;
    }

}
