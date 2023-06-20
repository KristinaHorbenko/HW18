package org.example;

import java.util.List;
import java.util.ArrayList;

public class Uppercase {

   public static List<Pair> createUpperCasePairs(List<String> strings) {
        List<Pair> upperCasePairs = new ArrayList<>();
        for (String string : strings) {
            String upperCaseString = string.toUpperCase();
            Pair pair = new Pair(string, upperCaseString);
            upperCasePairs.add(pair);
        }
        return upperCasePairs;
    }

}
