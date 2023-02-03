package baekjoon.math;

import java.util.Scanner;

public class N_10768{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        
        if (a < 2)
            System.out.println("Before");
        else if (a == 2){
            if (b < 18)
                System.out.println("Before");
            else if (b > 18)
                System.out.println("After");
            else
                System.out.println("Special");
        }
        else
            System.out.println("After");
    }
}
