package baekjoon.step.step_2;

import java.util.Scanner;

public class N_2480 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        if(a != b && a != c && b != c){
            System.out.print(max * 100);
        }else if(a == b && b == c){
            System.out.print(max * 1000 + 10000);
        }else if (a == b || a == c){
            System.out.print(a * 100 + 1000);
        }else{
            System.out.print(b * 100 + 1000);
        }
    }
}
