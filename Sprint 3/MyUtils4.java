/*
Create a createNotebook() method of the MyUtils class to create a new map with name as key and phone list as value.
The method receives a map  with phone as key and name as value.
For example, for a given map {0967654321=Petro, 0677654321=Petro, 0501234567=Ivan, 0970011223=Stepan, 0631234567=Ivan}
you should get {Ivan=[0501234567, 0631234567], Petro=[0967654321, 0677654321], Stepan=[0970011223]}.
 */

package com.softserve.edu.HW3;

import java.util.*;

public class MyUtils4 {
    public static void main(String args[]){

        Map<String, String> phones = new HashMap<>();
        phones.put("0967654321", "Petro");
        phones.put("0677654321", "Petro");
        phones.put("0501234567", "Ivan");
        phones.put("0970011223", "Stepan");
        phones.put("0631234567", "Ivan");
        MyUtils4 mu4 = new MyUtils4();
        System.out.println(mu4.createNotebook(phones));
    }

    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        HashSet<String> keysSet = new HashSet<>();
        for (Map.Entry<String, String> entry : phones.entrySet()) {
            keysSet.add(entry.getValue());
        }

        Map<String, List<String>> newMap = new HashMap<>();
        for (String name : keysSet) {
            newMap.put(name, null);
        }

        for (Map.Entry<String, String> entry : phones.entrySet()) {
            newMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return newMap;
    }
}