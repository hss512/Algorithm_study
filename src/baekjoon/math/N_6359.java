package baekjoon.math;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            for(int j = 1; j <= n; j++) {
                for(int k = 1; j*k <= n; k++) {
                    if(arr[j*k]!=0) {
                        arr[j*k]=0;
                    }else {  
                        arr[j*k]=1;
                    }
                }
            }
            int result = 0;
            for(int m = 1; m <= n; m++) {
                    result += arr[m];
            }
            System.out.println(result);
        }
    }
}
