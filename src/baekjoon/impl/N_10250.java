package baekjoon.impl;

import java.util.Scanner;
 
public class N_10250 {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
 
        for(int i = 0; i < T; i++) {
            int H = in.nextInt();
            int W = in.nextInt(); 
            int N = in.nextInt();
            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));
            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}
