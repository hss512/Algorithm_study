package baekjoon.step.step_4;

import java.util.Scanner;

public class N_10807 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] n = new int[N];

        int count = 0;

        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if(n[i] == v) count++;
        }

        System.out.print(count);
    }
}
