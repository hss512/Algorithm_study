package baekjoon.step.step_6;

import java.util.Scanner;

public class N_1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(f(sc.nextInt()));

    }

    private static int f(int n) {

        if(n < 100){
            return n;
        }else{
            int cnt = 99;

            for (int i = 100; i <= n; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }

            return cnt;
        }
    }
}
