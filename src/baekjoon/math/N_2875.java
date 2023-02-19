package baekjoon.math;

import java.util.Scanner;

public class N_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        while (n >= 2 && m >= 1 && n + m >= 3 + k) {
            n -= 2;
            m--;
            result++;
        }
        System.out.println(result);
    }
}
