/*
Create the strSort() method of the MyUtils class to sort a list of stirngs
first by length and alphabetically within the same length. The original list must be unchanged.
For example, for a given list [zz, abc, aa, aaa] you should get [aa, zz, aaa, abc].
 */

package com.softserve.edu.HW3;

import java.util.*;

public class MyUtils2 {
    public static void main(String[] args) {
        List<String> originList = new ArrayList<String>();
        originList.add("zz");
        originList.add("abc");
        originList.add("aa");
        originList.add("aaa");
        MyUtils2 mu2 = new MyUtils2();
        System.out.println(mu2.strSort(originList));
    }

    public List<String> strSort(List<String> originList) {
        List<String> cloned_list = new ArrayList<String>(originList);
        Collections.sort(cloned_list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        return cloned_list;
    }
}