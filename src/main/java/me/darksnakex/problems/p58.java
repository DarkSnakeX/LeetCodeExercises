package me.darksnakex.problems;

public class p58 {

    public int lengthOfLastWord(String s) {

        int cont = 0;
        for(int i =  s.length()-1; i >= 0 ;i--){
            char car =  s.charAt(i);
            if(car <= 122 && car >= 65){
                cont++;
            }else if(cont != 0){
                return cont;
            }

        }
        return 0;


    }

}
