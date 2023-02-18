package baekjoon.impl;

import java.util.Scanner;

public class N_1547{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {0, 1, 0, 0}; 

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
          
            int Y = sc.nextInt();
          
            int cnt = arr[X];
          
            arr[X] = arr[Y];
          
            arr[Y] = cnt;
        }

        for (int i = 0; i < 4; i++) {
            if (arr[i] == 1) {
                System.out.println(i); 
                break;
            }
        }
    }
}
