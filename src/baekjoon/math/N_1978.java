package baekjoon.math;

import java.util.Scanner;

public class N_1978 {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
      
        int N = sc.nextInt();
      
        int count = 0, check = 0;
      
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            
            check = 0;
            
            if(num == 1){
                continue;
            }
          
            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    check = 1;
                    break;
                }
            }
            if(check == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
