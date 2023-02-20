package baekjoon.impl;

import java.util.Scanner;

public class N_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rank = 0;

        int max = 0;

        for (int i =0 ; i < 5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if((a + b + c + d) > max){
                rank = i + 1;
                max = a + b + c + d;
            }
        }
        System.out.println(rank + " " +max);
    }
}
