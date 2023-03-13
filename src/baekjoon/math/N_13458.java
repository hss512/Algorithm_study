package baekjoon.math;

import java.util.Scanner;

public class N_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
      
        int[] A = new int[N];
      
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
      
        int B = sc.nextInt();  
      
        int C = sc.nextInt();
      
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            if(A[i] <= B){
                sum++;
                continue;
            }else{
                A[i] -= B;
                sum++;
                if(A[i] % C != 0){
                    sum += (A[i] / C) + 1;
                }else{
                    sum += A[i] / C;
                }
            }
        }
        System.out.println(sum);
    }
}
