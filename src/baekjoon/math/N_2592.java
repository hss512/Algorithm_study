package baekjoon.math;

import java.util.Scanner;

public class N_2592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        int[] arr = new int[1001];
        
        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            sum += n;
            arr[n]++;
        }

        int mode = 0;
        
        int max = 0;
        
        for(int i = 0; i < 1001; i++){
            if(max < arr[i]){
                max = arr[i];
                mode = i;
            }
        }
        System.out.println(sum/10);
        System.out.println(mode);
    }
}
