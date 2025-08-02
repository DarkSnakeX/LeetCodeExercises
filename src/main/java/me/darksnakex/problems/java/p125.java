package me.darksnakex.problems.java;

public class p125 {

    public boolean isPalindrome(String s) {

        String res = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int der = res.length() - 1;
        for (int izq = 0; izq < res.length() / 2; izq++) {
            // Caso de letras no iguales
            if (res.charAt(der) != res.charAt(izq)) {
                return false;
            }
            der--;

        }

        return true;
    }

}
