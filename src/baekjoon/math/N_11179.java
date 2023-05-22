package baekjoon.math;

import java.util.Scanner;

public class N_11179 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
       int num = sc.nextInt();
        
       String binary = Integer.toBinaryString(num);
       
       StringBuilder sb = new StringBuilder(binary);
        
       sb.reverse();
       
       int result = Integer.parseInt(sb.toString(),2);
        
       System.out.println(result);
    }
}
