package me.darksnakex.problems.java;

import java.util.ArrayList;
import java.util.List;

public class p2942 {

    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> res = new ArrayList<>();
        int actual = 0;
        String car = String.valueOf(x);

        for (String word : words) {
            if(word.contains(car)){
                res.add(actual);
            }
            actual++;

        }

        return res;
    }

}
