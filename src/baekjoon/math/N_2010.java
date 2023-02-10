package baekjoon.math;

import java.util.Scanner;

public class N_2010 {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int result = 0;
    
    for(int i = 0; i < N; i++){
      result += sc.nextInt();
    }
    
    System.out.print(result - N + 1);
  }
}
