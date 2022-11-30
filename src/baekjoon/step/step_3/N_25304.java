package baekjoon.step.step_3;

import java.util.Scanner;

public class N_25304 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cnt += a * b;
        }
        if(X == cnt){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
