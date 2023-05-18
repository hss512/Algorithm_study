package baekjoon.impl;

import java.util.Scanner;

public class N_11383{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();

        int check = 0;

        String str1 = "";

        String str2 = "";

        for(int i = 0; i < N; i++) {
            str1 += sc.next();
        }
        
        for(int i = 0; i < N; i++) {
            str2 += sc.next();
        }

        for(int i = 0; i < N * M * 2; i++) {
            if(str2.charAt(i) != str1.charAt(i/2)){
                check++;
            }
        }

        if(check == 0) {
            System.out.print("Eyfa");
        }else {
            System.out.print("Not Eyfa");
        }
    }
}
