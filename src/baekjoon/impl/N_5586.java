package baekjoon.impl;

import java.util.Scanner;

public class N_5586 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int count_1 = 0;
        
        int count_2 = 0;

        for(int i = 0; i < s.length() - 2; i++){
            boolean check = s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I';
            if(s.charAt(i) == 'J'){
                if(check)
                    count_1++;
            }
            if(s.charAt(i) == 'I'){
                if(check)
                    count_2++;
            }
        }
        
        System.out.println(count_1);
        
        System.out.println(count_2);
    }
}
