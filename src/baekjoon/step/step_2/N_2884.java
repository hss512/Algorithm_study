package baekjoon.step.step_2;


import java.util.Scanner;

public class N_2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, m;

        h = sc.nextInt();
        m = sc.nextInt();

        if(h == 0){
            h = 24;
        }

        int time = (h * 60) + m - 45;

        if(time/ 60 == 24){
            System.out.println(0 + " " + time%60);
        }else {
            System.out.println(time / 60 + " " + time % 60);
        }
    }
}
