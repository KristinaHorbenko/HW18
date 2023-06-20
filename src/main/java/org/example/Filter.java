package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<String> filter(List<String> collection ) {
        List<String> filter = new ArrayList<>();
        for (String str : collection) {
            if(str.length() == 4 && str.equals(str.toLowerCase())) {

                filter.add(str);
            }
        }
        return filter;


    }
}
