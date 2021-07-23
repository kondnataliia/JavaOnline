/*
Create a arrSort() method of the MyUtils class to sort a two-dimensional integer array
by descending the elements of the first column.
In the case of equality of elements in the first column,
the elements of the second column must be sorted in ascending order.
*/

package com.softserve.edu.HW3;

import java.util.Arrays;
import java.util.Comparator;

public class MyUtils1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 4}, {3, 2}, {3, 3, 5}};
        MyUtils1 mu1 = new MyUtils1();
        System.out.println(Arrays.deepToString(mu1.arrSort(arr)));
    }

    public int[][] arrSort(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1.length == 0 && o2.length == 0) {return 0;}
                if (o1.length == 0) {return 1;}
                if (o2.length == 0) {return -1;}
                if (o1[0] == o2[0]) {
                    if (o1.length > 1 && o2.length > 1) {
                        return o1[1] - o2[1];
                    }
                    if (o1.length > 1) {return 1;}
                    if (o2.length > 1) {return -1;}
                }
                return o2[0] - o1[0];}
        });
        return arr;}
}
