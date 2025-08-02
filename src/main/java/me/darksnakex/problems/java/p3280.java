package me.darksnakex.problems.java;

public class p3280 {

    public String convertDateToBinary(String date) {

        int anio = Integer.parseInt(date.substring(0,4));
        int mes =  Integer.parseInt(date.substring(5,7));
        int dia = Integer.parseInt(date.substring(8,10));


        return Integer.toBinaryString(anio)+"-"+Integer.toBinaryString(mes)+"-"+Integer.toBinaryString(dia);

    }

}
