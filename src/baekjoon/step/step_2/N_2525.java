package baekjoon.step.step_2;

import java.util.Scanner;

public class N_2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int input = sc.nextInt();

        int time = hour * 60 + minutes + input;

        System.out.print(time/60%24 + " " + time%60);

    }
}
