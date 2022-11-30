package baekjoon.step.step_4;

import java.util.Scanner;

public class N_5597 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] students = new int[31];

        for(int i = 1; i < 29; i++) {
            int input = sc.nextInt();
            students[input] = 1;
        }
        for(int i = 1; i < 31; i++) {
            if(students[i] != 1)
                System.out.println(i);
        }
    }
}
