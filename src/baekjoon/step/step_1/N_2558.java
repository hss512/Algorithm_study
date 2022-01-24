package baekjoon.step.step_1;

import java.util.Scanner;

public class N_2558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println(a * ((b % (int)Math.pow(10, i+1)) / (int)Math.pow(10, i)));
        }
        System.out.println(a * b);
    }
}
