/*
Create a listMapCompare() method of the MyUtils class to compare
the contents of a list of strings and the values of a map.
For example, for a given list [aa, bb, aa, cc] and map {1=cc, 2=bb, 3=cc, 4=aa, 5=cc} you should get true.
 */

package com.softserve.edu.HW3;

import java.util.*;
import java.util.List;
import java.util.Map;

public class MyUtils3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("aa");
        list.add("cc");

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "cc");
        map.put("2", "bb");
        map.put("3", "cc");
        map.put("4", "aa");
        map.put("5", "cc");
        MyUtils3 mu3 = new MyUtils3();
        System.out.println(mu3.listMapCompare(list, map));
    }

    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        for (String value : list) {
            if (!map.containsValue(value))
                return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!list.contains(entry.getValue()))
                return false;
        }
        return true;
    }
}