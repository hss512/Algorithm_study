package baekjoon.impl;

import java.util.Scanner;
import java.util.ArrayList;

public class N_1077 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
      
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (String color : colors) {
            list.add(color);
        }

        int first = list.indexOf(sc.next())*10;
      
        int second = list.indexOf(sc.next());
      
        int third = list.indexOf(sc.next());

        System.out.println((long)((first + second) * Math.pow(10, third)));

    }
}
