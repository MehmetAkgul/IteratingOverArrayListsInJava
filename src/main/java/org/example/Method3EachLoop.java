package org.example;

import java.util.ArrayList;

public class Method2EachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        int val = 0;
        while (al.size() > val) {
            System.out.println(al.get(val));
            val++;
        }
    }
}
