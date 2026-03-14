package me.darksnakex.problems.java;


public class p67 {

    public static String addBinary(String a, String b) {

        StringBuilder res = new StringBuilder();
        boolean bitacarreo = false;
        int longitudm = Math.max(a.length(), b.length());


        for(int i = 1; i <= longitudm; i++){

            char cara;
            if (a.length() - i >= 0) {
                cara = a.charAt(a.length() - i);
            } else {
                cara = '0';
            }

            char carb;
            if (b.length() - i >= 0) {
                carb = b.charAt(b.length() - i);
            } else {
                carb = '0';
            }

            if(cara == '0' && carb == '0'){ // caso: 0+0
                if(bitacarreo){
                    res.append('1');
                    bitacarreo=false;
                }else {
                    res.append('0');
                }
            }
            else if((cara == '1' && carb == '0') || (cara == '0' && carb == '1')){ // caso: 0+1 o 1+0
                if(bitacarreo){
                    res.append('0');
                }else {
                    res.append('1');
                }
            } else if (cara == '1' && carb == '1') { // caso: 1+1
                if(bitacarreo){
                    res.append('1');
                }else{
                    res.append('0');
                }
                bitacarreo = true;
            }


        }

        if(bitacarreo){
            res.append('1');
        }
        return res.reverse().toString();

    }

    public static void main(String[] args){
        System.out.println(addBinary("1010","1011"));
        System.out.println(addBinary("11","1"));
    }
}
