package me.darksnakex.problems.java;

public class p3 {

    public int lengthOfLongestSubstring(String s) {

        StringBuilder res = new StringBuilder();
        int cont = 0;
        int fin = 0;

        for (int i = 0; i < s.length(); i++) {
            String ac = String.valueOf(s.charAt(i));
            //System.out.println(ac);
            if (!(res.toString().contains(ac))) {
                res.append(ac);
                cont++;

            } else {

                fin = Math.max(fin, cont);
                int indice = res.indexOf(ac);
                if (indice != -1) {
                    res = new StringBuilder(res.substring(indice + 1)).append(ac);
                    cont = res.length();
                }

            }

        }
        return Math.max(fin, cont);

    }
}
