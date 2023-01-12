package baekjoon.step.step_6;

import java.util.Scanner;

public class N_11720 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String n = in.next();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += n.charAt(i)-'0';
        }

        System.out.print(sum);
    }
}
