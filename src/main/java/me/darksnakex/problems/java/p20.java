package me.darksnakex.problems.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class p20 {

    public static boolean isValid(String s) {

        Stack<Character> pila = new Stack<>();

        if(s.length() % 2 != 0){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                pila.push(')');
            } else if (s.charAt(i) == '{') {
                pila.push('}');
            }
            else if (s.charAt(i) == '[') {
                pila.push(']');
            } else if (pila.isEmpty() || pila.pop() != s.charAt(i)) {
                return false;

            }

        }

        return pila.isEmpty();

    }




    public static void main(String[] args){

        System.out.println(isValid("()")); // bien
        System.out.println("(]"); // mal
        System.out.println("([])"); // bien
        System.out.println("([)]"); // mal

    }


    
}


