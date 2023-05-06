package baekjoon.impl;

import java.util.Scanner;

public class N_10811 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }

        for(int k = 0; k < M; k ++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while(i < j){
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
