package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class N_2693 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[10];

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            results[i] = arr[7];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
