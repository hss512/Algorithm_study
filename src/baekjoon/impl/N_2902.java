package baekjoon.impl;

import java.util.Scanner;

public class N_2902 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String result = "";
        
        for(int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                result += str.charAt(i);
        }
        
        System.out.println(result);
    }
}
