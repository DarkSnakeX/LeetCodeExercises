package me.darksnakex.problems.java;

public class p2264 {

    public String largestGoodInteger(String num) {

        String res = "";
        char anterior = 0;
        char anterior2 = 0;
        for(int i = 0; i < num.length(); i++){
            if(anterior ==  anterior2 && anterior2 == num.charAt(i)) {
                if(res.isEmpty() || num.charAt(i) > res.charAt(0)) {
                    res = anterior2 + String.valueOf(anterior) + num.charAt(i);
                    anterior = 0;
                }
            }
            anterior2 = anterior;
            anterior = num.charAt(i);
        }


        return res;

    }

}
