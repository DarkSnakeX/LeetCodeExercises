package me.darksnakex.problems.java;

public class p680 {


    public boolean validPalindrome(String s) {

        StringBuilder res = new StringBuilder(s);

        int der = res.length()-1;
        for(int izq = 0; izq < res.length()/2; izq++){
            // Caso de letras no iguales
            if(res.charAt(der) != res.charAt(izq)){
                StringBuilder res2 = new StringBuilder(res);
                return aux(res.deleteCharAt(izq), izq, der) || aux(res2.deleteCharAt(der), izq, der);
            }
            der--;

        }

        return true;
    }

    private boolean aux(StringBuilder text, int izq, int der){
        der--;
        for(; izq < text.length()/2; izq++){
            // Caso de letras no iguales
            if(text.charAt(der) != text.charAt(izq)){
                return false;
            }
            der--;

        }

        return true;

    }

}
