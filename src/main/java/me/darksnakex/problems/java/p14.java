package me.darksnakex.problems.java;

public class p14 {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();
        if(strs.length==1 || strs[0].isEmpty()){
            return strs[0];
        }

        String palabra = strs[0];

        int j = 0;
        for(int i = 1; i < strs.length; i++){
            if(j >= palabra.length() || j >= strs[i].length() || palabra.charAt(j) != strs[i].charAt(j)){
                break;
            }
            if(i+1 >= strs.length){
                res.append(palabra.charAt(j));
                i = 0;
                j++;
            }

        }

        return res.toString();

    }

}
