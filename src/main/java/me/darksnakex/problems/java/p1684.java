package me.darksnakex.problems.java;

public class p1684 {

    public int countConsistentStrings(String allowed, String[] words) {

       int res = 0;

        for (String word : words) {
            String pal = word;
            for (int j = 0; j < allowed.length(); j++) {
                pal = pal.replaceAll(String.valueOf(allowed.charAt(j)), "");
            }
            if (pal.isEmpty()) {
                res++;
            }
        }

       return res;


    }

}
