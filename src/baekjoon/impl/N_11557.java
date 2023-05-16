package baekjoon.impl;

import java.util.Scanner;

public class N_11557 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String S = "";
            int L = 0;
            sc.nextLine();

            for(int j = 0; j < N; j++) {
                String str = sc.nextLine();
                String[] array = str.split(" ");
                String s = array[0];
                int l = Integer.parseInt(array[1]);
                if(L < l) {
                    S = s;
                    L = l;
                }
            }
            System.out.println(S);
        }
    }
}
