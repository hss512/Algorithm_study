package baekjoon.baekjoon_2.number_1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
            System.out.print(">");
        }else if(a < b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
