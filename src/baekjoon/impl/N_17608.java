package baekjoon.impl;

import java.util.Scanner;

public class N_17608 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
		
        int count = 1;
        
        int max = arr[arr.length-1];
	
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] > max) {
                count ++;
                max = arr[i];
            }
        }
		
        System.out.println(count);
    }
}
