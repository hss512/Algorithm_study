package baekjoon.math;

import java.util.Scanner;

public class N_2506 {
 
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
		
        int count = 0, result = 0;
    
        int N = sc.nextInt();
    
        int[] arr = new int[N];
    
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
    
        for(int i : arr){
            if(i == 1){
              count++;
              result += count;
            }else{
              count = 0;
            }
        }
        System.out.println(result);
	  }
}
