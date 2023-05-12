package baekjoon.impl;

import java.util.Scanner;

public class N_1236 {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int M = sc.nextInt();
        
        int row = 0;
        
        int col = 0;
        
        char[][] ch = new char[N][M];
        
        for(int i = 0; i < ch.length; i++) {
            String str = sc.next();
            
            for(int j = 0; j < ch[i].length; j++) {
                ch[i][j] = str.charAt(j);
            }
        }
		
        for(int i = 0; i < N; i++) {
            boolean flag = true;
            for(int j = 0; j < M; j++) {
                if(ch[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag){
                row ++;
            }
        }
		
        for(int i = 0; i < M; i++) {
            boolean flag = true;
            for(int j = 0; j < N; j++) {
                if(ch[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                col ++;
        }
		
        System.out.println(Math.max(row, col));
    }
}
