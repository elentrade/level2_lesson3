package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

   //     1-st part of homework
        List <String>list = new ArrayList<>();
        List <String>list1 = new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("Mach");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        list.add("February");
        list.add("Mach");
        list.add("April");
        list.add("February");


        for (int i=0; i<list.size();i++) {
            int count = 0;
            String unit = list.get(i);
            if (!list1.contains(unit)) {
                list1.add(unit);
                for (int j = i; j < list.size(); j++) {
                    if (list.get(j) == unit) {
                        count = count + 1;
                    }
                }
                System.out.println(unit + " " + count);

            }
        }
        System.out.println(list1);

    }
}
