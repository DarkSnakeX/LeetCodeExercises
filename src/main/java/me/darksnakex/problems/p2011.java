package me.darksnakex.problems;

import java.util.Collections;
import java.util.List;

public class p2011 {


    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                x += 1;
            } else {
                x -= 1;
            }

        }

        return x;

    }

    // Not that well lmao
    public int finalValueAfterOperationsv2(String[] operations) {
        List<String> list = List.of(operations);
        return Collections.frequency(list,"X++") + Collections.frequency(list,"++X") - Collections.frequency(list,"X--") -Collections.frequency(list,"--X");

    }



}

