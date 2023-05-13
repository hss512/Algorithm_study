package baekjoon.bruteForce;

import java.util.*;

public class N_1145 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int n = 1;
        
        int count = 0;

        while (true) {
            for (int k = 0; k < 5; k++) {
                if (n % arr[k] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(n);
                return;
            }
            count = 0;
            n++;
        }
    }
}
