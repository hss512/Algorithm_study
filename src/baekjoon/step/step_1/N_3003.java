package baekjoon.step.step_1;

import java.util.Scanner;

public class N_3003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] full = new int[]{1,1,2,2,2,8};

        int[] input = new int[6];

        for (int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(full[i] - input[i] + " ");
        }
    }
}
